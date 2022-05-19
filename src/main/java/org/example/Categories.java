package org.example;

public enum Categories {
    CODEMONKEY("CodeMonkey"),
    HUB("Hub"),
    SHORT("Short"),
    TEAMBUILDING("TeamBuilding"),
    DAILYSTANDUP("DailyStandUp");

    private final String name;

    private Categories(String constant) {
        this.name = constant;
    }
}

