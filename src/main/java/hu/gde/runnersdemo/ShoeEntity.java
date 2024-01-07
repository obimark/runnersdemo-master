package hu.gde.runnersdemo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoeEntity  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shoeId;
    private String shoeName;

    @ManyToOne
    @JoinColumn(name = "runner_id")
    private RunnerEntity runner;

    public long getShoeId() {
        return shoeId;
    }

    public String getShoeName() {
        return shoeName;
    }
    public void setRunner(RunnerEntity runner) {
        this.runner = runner;
    }

    public void setShoeId(long shoeId) {
        this.shoeId = shoeId;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

}
