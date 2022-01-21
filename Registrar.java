package assn1.mys;

import java.util.*;
/**
 * class representing Registrar (utility class)
 * @author Maxime Sotsky 3637964
 */
public class Registrar {

	/**
	 * enumeration class - (final variables representing grade formats)
	 * @author Maxime Sotsky
	 */
    public enum finalGrade{

        APLUS("A+", 4.3f, 4.1f), A("A", 4.0f, 3.8f), AMINUS("A-", 3.7f, 3.4f),
        BPLUS("B+", 3.3f, 3.1f), B("B", 3.0f, 2.8f), BMINUS("B-", 2.7f, 2.4f),
        CPLUS("C+", 2.3f, 2.2f), C("C", 2.0f, 1.1f),
        D("D", 1.0f, 0.1f),
        F("F", 0.0f, 0.0f);

    	/** letter - letter grade */
        private final String letter;
        /** high - higher level of the grade bracket */
        private final float high;
        /** low - lower level of the grade bracket */
        private final float low;

        /**
         * *final* grade constructor
         * @param letter -grade
         * @param high -higher bracket
         * @param low -lower bracket
         */
        private finalGrade(String letter, float high, float low) {
            this.letter = letter;
            this.high = high;
            this.low = low;
        }
    }
    
    /**
     * function to convert grade from grade points to letter grade
     * @param gpGrade -the grade point to be converted to letter grade
     * @return -the letter grade
     */
    public static String convertGrade(float gpGrade){
        for(finalGrade g: finalGrade.values()){
            if(g.low <= gpGrade && gpGrade <= g.high){
                return g.letter;
            }
        }
        return null;
    }
    
    //@Overload
    public static float convertGrade(String let) {
    	for(finalGrade g: finalGrade.values()) {
    		if(g.letter.equals(let)) {
    			return g.high;
    		}
    	}
    	return 0.0f / 0.0f;
    }

    /**
     * function to calculate GPA from grade points
     * @param lst -the list of grades (courses in transcript)
     * @return float representing GPA
     */
    public static float getGPA(ArrayList<Grade> lst){
        float gpa = 0.0f;
        float totalGP = 0.0f;
        int totalCredit = 0;

        for(int i = 0; i < lst.size(); i++){
            totalGP += lst.get(i).getCredit() * lst.get(i).getGp();
            totalCredit += lst.get(i).getCredit();
        }
        if(totalCredit == 0){
            //to achieve NaN value (reason for using float instead of double)
            return 0.0f / 0.0f;
        }
        gpa = totalGP / totalCredit;
        return Math.round(gpa*100.0f)/100.0f;
    }
}
