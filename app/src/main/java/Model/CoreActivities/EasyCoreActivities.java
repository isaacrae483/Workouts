package Model.CoreActivities;

import java.util.ArrayList;

import Model.Activity;

public class EasyCoreActivities {
    ArrayList<Activity> activities = new ArrayList();

    public EasyCoreActivities() {
        activities.add(new Activity("crunches", "50", 5));
        activities.add(new Activity("sit ups", "35", 5));
        activities.add(new Activity("leg lifts", "20", 5));
        activities.add(new Activity("bus drivers", "60 sec", 5));
        activities.add(new Activity("bicycles", "60 sec", 5));
        activities.add(new Activity("planks", "30 sec", 5));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
