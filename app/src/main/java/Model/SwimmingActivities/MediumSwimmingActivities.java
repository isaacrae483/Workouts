package Model.SwimmingActivities;

import java.util.ArrayList;

import Model.Activity;

public class MediumSwimmingActivities {
    ArrayList<Activity> activities = new ArrayList();

    public MediumSwimmingActivities() {
        activities.add(new Activity("swim butterfly", "200 meters", 15));
        activities.add(new Activity("swim free style", "300 meters", 15));
        activities.add(new Activity("swim back stroke", "300 meters", 15));
        activities.add(new Activity("tread water", "90 sec", 5));
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
