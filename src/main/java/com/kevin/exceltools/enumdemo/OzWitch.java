package com.kevin.exceltools.enumdemo;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2220:46
 */
public enum OzWitch {

    WEST("Miss Gulch,aka the Witch of the West"),
    NORTH("Glinda,the Good Witch of the North"),
    EAST("Witchd Witch of the East,wearer of the Ruby Slippers,crushed by Dorothy's house"),
    SOUTH("Good by inference,but missing");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {

        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch + "：" + ozWitch.getDescription());
        }

    }
}
