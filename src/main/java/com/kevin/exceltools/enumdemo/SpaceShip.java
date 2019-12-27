package com.kevin.exceltools.enumdemo;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2221:08
 */
public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESSHIP, MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip spaceShip : SpaceShip.values()) {
            System.out.println(spaceShip);

        }
    }
}


