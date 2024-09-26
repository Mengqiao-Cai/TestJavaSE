package com.cmq.enum02;

/**
 * @author: cmq
 * @date: 9/24/2024 - 09 - 24 - 3:36 PM
 * @version: 1.0
 */
public enum Season {
    SPRING("spring", "its spring!"),
    SUMMER("summer", "hot"),
    AUTUMN ("autumn", "its autumn"),
    WINTER("winter", "cold");
    private final String seasonName;
    private final String seasonDesc;
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }



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
