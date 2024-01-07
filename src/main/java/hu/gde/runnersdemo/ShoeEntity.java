package hu.gde.runnersdemo;
import jakarta.persistence.*;

@Entity
public class ShoeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shoeId;
    private String shoeName;

    @ManyToOne
    @JoinColumn(name = "runner_id")
    private RunnerEntity runner;


    public ShoeEntity(){

    }
    public long getShoeId() {
        return shoeId;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeId(long shoeId) {
        this.shoeId = shoeId;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

}
