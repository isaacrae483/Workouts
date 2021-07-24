package Model.RunningActivities;

import java.util.ArrayList;

import Model.Activity;

public class MediumRunningActivities {
    ArrayList<Activity> activities = new ArrayList();

    public MediumRunningActivities() {
        activities.add(new Activity("run", "30 min", 30));
        activities.add(new Activity("sprint", "6 x 30 sec", 15));
        activities.add(new Activity("tempo pace", "15 min", 15));
        activities.add(new Activity("casual run", "45 min", 45));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
