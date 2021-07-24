package Model.RunningActivities;

import java.util.ArrayList;

import Model.Activity;

public class SpartanRunningActivities {
    ArrayList<Activity> activities = new ArrayList();

    public SpartanRunningActivities() {
        activities.add(new Activity("run", "60 min", 60));
        activities.add(new Activity("sprint", "10 x 30 sec", 15));
        activities.add(new Activity("tempo pace", "45 min", 45));
        activities.add(new Activity("casual run", "90 min", 90));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
