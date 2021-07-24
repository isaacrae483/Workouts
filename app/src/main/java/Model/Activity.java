package Model;

public class Activity {
    String name;
    String reps;
    Integer time;

    public Activity(String name, String reps, Integer time) {
        this.name = name;
        this.reps = reps;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getReps() {
        return reps;
    }

    public Integer getTime() {
        return time;
    }
}
