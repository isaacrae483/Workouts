package Model.CyclingActivities;

import java.util.ArrayList;

import Model.Activity;

public class HardCyclingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public HardCyclingActivities() {
        activities.add(new Activity("casual bike", "60 min", 60));
        activities.add(new Activity("bike hills", "45 min", 45));
        activities.add(new Activity("swiftly bike", "45 min", 45));
        activities.add(new Activity("bike very fast", "15 min", 15));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
