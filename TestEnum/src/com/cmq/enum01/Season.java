package com.cmq.enum01;

/**
 * @author: cmq
 * @date: 9/24/2024 - 09 - 24 - 3:36 PM
 * @version: 1.0
 */
public class Season {
    private final String seasonName;
    private final String seasonDesc;
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Season SPRING = new Season("spring", "its spring!");
    public static final Season SUMMER = new Season("summer", "hot");
    public static final Season AUTUMN = new Season("autumn", "its autumn");
    public static final Season WINTER = new Season("winter", "cold");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
