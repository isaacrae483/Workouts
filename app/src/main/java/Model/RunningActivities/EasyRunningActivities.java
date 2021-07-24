package Model.RunningActivities;

import java.util.ArrayList;

import Model.Activity;

public class EasyRunningActivities {
    ArrayList<Activity> activities = new ArrayList();

    public EasyRunningActivities() {
        activities.add(new Activity("run", "15 min", 15));
        activities.add(new Activity("sprint", "4 x 30 sec", 5));
        activities.add(new Activity("tempo pace", "10 min", 10));
        activities.add(new Activity("casual run", "30 min", 30));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
