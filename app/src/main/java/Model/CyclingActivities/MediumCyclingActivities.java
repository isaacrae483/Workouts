package Model.CyclingActivities;

import java.util.ArrayList;

import Model.Activity;

public class MediumCyclingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public MediumCyclingActivities() {
        activities.add(new Activity("casual bike", "45 min", 45));
        activities.add(new Activity("bike hills", "30 min", 30));
        activities.add(new Activity("swiftly bike", "30 min", 30));
        activities.add(new Activity("bike very fast", "15 min", 15));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
