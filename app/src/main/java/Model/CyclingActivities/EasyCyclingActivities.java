package Model.CyclingActivities;

import java.util.ArrayList;

import Model.Activity;

public class EasyCyclingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public EasyCyclingActivities() {
        activities.add(new Activity("casual bike", "30 min", 30));
        activities.add(new Activity("bike hills", "15 min", 15));
        activities.add(new Activity("swiftly bike", "15 min", 15));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
