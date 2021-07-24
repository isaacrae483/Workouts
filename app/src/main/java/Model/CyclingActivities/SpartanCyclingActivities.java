package Model.CyclingActivities;

import java.util.ArrayList;

import Model.Activity;

public class SpartanCyclingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public SpartanCyclingActivities() {
        activities.add(new Activity("casual bike", "90 min", 90));
        activities.add(new Activity("bike hills", "60 min", 60));
        activities.add(new Activity("swiftly bike", "60 min", 60));
        activities.add(new Activity("bike very fast", "15 min", 15));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
