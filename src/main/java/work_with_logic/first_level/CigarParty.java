package work_with_logic.first_level;

public class CigarParty {
    static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        }
        if (isWeekend == false) {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
        }
        return false;
    }

    static boolean cigarParty2(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars > 40;
        } else {
            return cigars > 40 && cigars <= 60;
        }
    }
}
