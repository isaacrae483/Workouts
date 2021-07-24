package Model.CoreActivities;

import java.util.ArrayList;

import Model.Activity;

public class SpartanCoreActivities {
    ArrayList<Activity> activities = new ArrayList();

    public SpartanCoreActivities() {
        activities.add(new Activity("crunches", "300", 5));
        activities.add(new Activity("sit ups", "150", 5));
        activities.add(new Activity("leg lifts", "120", 5));
        activities.add(new Activity("bus drivers", "180 sec", 5));
        activities.add(new Activity("bicycles", "180 sec", 5));
        activities.add(new Activity("planks", "120 sec", 5));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
