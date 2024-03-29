package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RunnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long runnerId;
    private String runnerName;
    private int runnerAge;
    private long averagePace;

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LapTimeEntity> laptimes = new ArrayList<>();

    @OneToMany(mappedBy = "runner")
    private List<ShoeEntity> shoes = new ArrayList<>();

    public long getRunnerId() {
        return runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public int getRunnerAge() {
        return runnerAge;
    }

    public long getAveragePace() {
        return averagePace;
    }

    public void setRunnerId(long runnerId) {
        this.runnerId = runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public void setRunnerAge(int runnerAge) {
        this.runnerAge = runnerAge;
    }

    public void setAveragePace(long averagePace) {
        this.averagePace = averagePace;
    }

    public List<LapTimeEntity> getLaptimes() {
        return laptimes;
    }
    public List<ShoeEntity> getShoes() {
        return shoes;
    }



}
