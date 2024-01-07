package hu.gde.runnersdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunnerService {

    public final RunnerRepository runnerRepository;

    @Autowired
    public RunnerService(RunnerRepository runnerRepository) {
        this.runnerRepository = runnerRepository;
    }

    public double getAverageLaptime(Long runnerId) {
        RunnerEntity runner = runnerRepository.findById(runnerId).orElse(null);
        if (runner != null) {
            List<LapTimeEntity> laptimes = runner.getLaptimes();
            int totalTime = 0;
            for (LapTimeEntity laptime : laptimes) {
                totalTime += laptime.getTimeSeconds();
            }
            return (double) totalTime / laptimes.size();
        } else {
            // handle error when runner is not found
            return -1.0;
        }
    }

    public static double getAvarageAge(RunnerRepository runnerRepository) {
        List<RunnerEntity> runners = runnerRepository.findAll();
        if (runners.isEmpty()) {
            return 0;
        }

    double totalAge = 0;
        for (RunnerEntity runner : runners) {
            totalAge += runner.getRunnerAge();
        }

        return (double) totalAge / runners.size();


    }




}
