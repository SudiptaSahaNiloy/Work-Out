package com.example.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 push_ups\n100 sit-ups\n100 Squats"),
            new Workout("The Wimp Special", "5 pull-ups\n10 push-ups\n15 squats"),
            new Workout("Strength and Length", "500 meter run\n21 x 1.5 pood kettlebal swing\n21 x Pull-ups"),
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

//    public String toString() {
//        return this.name;
//    }
}
