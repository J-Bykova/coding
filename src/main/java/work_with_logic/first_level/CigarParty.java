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
}
