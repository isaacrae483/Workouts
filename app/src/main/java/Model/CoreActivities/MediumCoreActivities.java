package Model.CoreActivities;

import java.util.ArrayList;

import Model.Activity;

public class MediumCoreActivities {
    ArrayList<Activity> activities = new ArrayList();

    public MediumCoreActivities() {
        activities.add(new Activity("crunches", "100", 5));
        activities.add(new Activity("sit ups", "75", 5));
        activities.add(new Activity("leg lifts", "50", 5));
        activities.add(new Activity("bus drivers", "90 sec", 5));
        activities.add(new Activity("bicycles", "90 sec", 5));
        activities.add(new Activity("planks", "60 sec", 5));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
