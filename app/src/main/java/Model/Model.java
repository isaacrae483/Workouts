package Model;

import java.util.ArrayList;
import java.util.Random;

import Model.RunningActivities.*;
import Model.SwimmingActivities.*;
import Model.CyclingActivities.*;
import Model.CoreActivities.*;


public class Model {
    private static Model _instance;
    public static Model instance() {
        if (_instance == null){
            _instance = new Model();
        }
        return _instance;
    }

    WorkoutTypes type;
    int time;
    Difficulties difficulty;
    ArrayList<Activity> activities = new ArrayList();

    private Model(){
        type = null;
        time = 0;
        difficulty = null;
    }

    public void generate(){
        int remaingTime = time;
        ArrayList<Activity> possibleActivities = null;
        activities = new ArrayList();
        switch (type) {
            case RUNNING:
                switch (difficulty) {
                    case EASY:
                        possibleActivities = new EasyRunningActivities().getActivities();
                        break;
                    case MEDIUM:
                        possibleActivities = new MediumRunningActivities().getActivities();
                        break;
                    case HARD:
                        possibleActivities = new HardRunningActivities().getActivities();
                        break;
                    case SPARTAN:
                        possibleActivities = new SpartanRunningActivities().getActivities();
                        break;
                }
                break;
            case SWIMMING:
                switch (difficulty) {
                    case EASY:
                        possibleActivities = new EasySwimmingActivities().getActivities();
                        break;
                    case MEDIUM:
                        possibleActivities = new MediumSwimmingActivities().getActivities();
                        break;
                    case HARD:
                        possibleActivities = new HardSwimmingActivities().getActivities();
                        break;
                    case SPARTAN:
                        possibleActivities = new SpartanSwimmingActivities().getActivities();
                        break;
                }
                break;
            case CYCLING:
                switch (difficulty) {
                    case EASY:
                        possibleActivities = new EasyCyclingActivities().getActivities();
                        break;
                    case MEDIUM:
                        possibleActivities = new MediumCyclingActivities().getActivities();
                        break;
                    case HARD:
                        possibleActivities = new HardCyclingActivities().getActivities();
                        break;
                    case SPARTAN:
                        possibleActivities = new SpartanCyclingActivities().getActivities();
                        break;
                }
                break;
            case COREONLY:
                switch (difficulty) {
                    case EASY:
                        possibleActivities = new EasyCoreActivities().getActivities();
                        break;
                    case MEDIUM:
                        possibleActivities = new MediumCoreActivities().getActivities();
                        break;
                    case HARD:
                        possibleActivities = new HardCoreActivities().getActivities();
                        break;
                    case SPARTAN:
                        possibleActivities = new SpartanCoreActivities().getActivities();
                        break;
                }
                break;
            default:
                activities = null;
                return;
        }
        if (activities == null)
            return;
        while(remaingTime > 0){
            Activity activity = getRandomElement(possibleActivities, remaingTime);
            remaingTime -= activity.getTime();
            activities.add(activity);
        }
        return;
    }

    public Activity getRandomElement(ArrayList<Activity> list, int RT)
    {
        while(true) {
            Random rand = new Random();
            Activity item = list.get(rand.nextInt(list.size()));
            if (item.getTime() <= RT) {
                return item;
            }
        }
    }

    public WorkoutTypes getType() {
        return type;
    }

    public void setType(WorkoutTypes type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Difficulties getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulties difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
