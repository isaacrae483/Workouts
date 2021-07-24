package Model.SwimmingActivities;

import java.util.ArrayList;

import Model.Activity;

public class HardSwimmingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public HardSwimmingActivities() {
        activities.add(new Activity("swim butterfly", "300 meters", 20));
        activities.add(new Activity("swim free style", "500 meters", 20));
        activities.add(new Activity("swim back stroke", "500 meters", 20));
        activities.add(new Activity("tread water", "120 sec", 5));
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
