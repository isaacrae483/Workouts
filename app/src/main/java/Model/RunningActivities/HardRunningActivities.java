package Model.RunningActivities;

import java.util.ArrayList;

import Model.Activity;

public class HardRunningActivities {
    ArrayList<Activity> activities = new ArrayList();

    public HardRunningActivities() {
        activities.add(new Activity("run", "45 min", 45));
        activities.add(new Activity("sprint", "8 x 30 sec", 15));
        activities.add(new Activity("tempo pace", "30 min", 30));
        activities.add(new Activity("casual run", "60 min", 60));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
