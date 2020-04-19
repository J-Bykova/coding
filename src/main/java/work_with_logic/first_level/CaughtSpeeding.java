package work_with_logic.first_level;

public class CaughtSpeeding {
    static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 60 + 5) {
                return 0;
            }
            if (speed >= 61 && speed <= 80 + 5) {
                return 1;
            }
            if (speed >= 81) {
                return 2;
            }
        }
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            }
            if (speed >= 61 && speed <= 80) {
                return 1;
            }
            if (speed >= 81) {
                return 2;
            }
        }

        return 3;

    }
}

