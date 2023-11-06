package perpro.bodymorph.tsaqibwahid.model;

import lombok.Getter;

@Getter
public enum ActivityType {
    CARDIO("Cardio"),
    WEIGHTLIFTING("Weight Lifting"),
    REST("Rest");

    private final String activityType;

    ActivityType(String activityType) { this.activityType = activityType; }
}
