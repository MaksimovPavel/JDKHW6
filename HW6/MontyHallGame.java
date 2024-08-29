package HW6;

import java.util.Random;

public class MontyHallGame {
    static Random random = new Random();
    static int userDoor, openDoor, otherDoor;

    public static String game() {
        String result;
        int prizeDoor = random.nextInt(1,4);
        int goatDoor1 = prizeDoor;
        while (goatDoor1 == prizeDoor) {
            goatDoor1 = random.nextInt(1, 4);
        }
        int goatDoor2 = goatDoor1;
        while (goatDoor2 == goatDoor1 || goatDoor2 == prizeDoor) {
            goatDoor2 = random.nextInt(1, 4);
        }

        userDoor = random.nextInt(1, 4);

        if (userDoor == goatDoor1) {
            openDoor = goatDoor2;
            otherDoor = prizeDoor;
        } else if (userDoor == goatDoor2) {
            openDoor = goatDoor1;
            otherDoor = prizeDoor;
        } else {
            openDoor = goatDoor1;
            otherDoor = goatDoor2;
        }
        userDoor = otherDoor;
        if (userDoor == prizeDoor) {
            return result = "Victory";
        } else return result = "Loss";
    }

}