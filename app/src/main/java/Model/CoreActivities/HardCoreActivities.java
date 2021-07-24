package Model.CoreActivities;

import java.util.ArrayList;

import Model.Activity;

public class HardCoreActivities {
    ArrayList<Activity> activities = new ArrayList();

    public HardCoreActivities() {
        activities.add(new Activity("crunches", "150", 5));
        activities.add(new Activity("sit ups", "100", 5));
        activities.add(new Activity("leg lifts", "75", 5));
        activities.add(new Activity("bus drivers", "120 sec", 5));
        activities.add(new Activity("bicycles", "120 sec", 5));
        activities.add(new Activity("planks", "90 sec", 5));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
