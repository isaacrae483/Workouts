package Model.SwimmingActivities;

import java.util.ArrayList;

import Model.Activity;

public class SpartanSwimmingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public SpartanSwimmingActivities() {
        activities.add(new Activity("swim butterfly", "500 meters", 30));
        activities.add(new Activity("swim free style", "800 meters", 30));
        activities.add(new Activity("swim back stroke", "800 meters", 30));
        activities.add(new Activity("tread water", "180 sec", 5));
        activities.add(new Activity("play water polo", "15 min", 15));
        activities.add(new Activity("play water polo", "30 min", 30));
        activities.add(new Activity("play water polo", "45 min", 45));
        activities.add(new Activity("play water polo", "60 min", 60));
        activities.add(new Activity("play water polo", "75 min", 75));
        activities.add(new Activity("play water polo", "90 min", 90));
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
