package assn1.mys;
/**
 * class that represents a grade (course)
 * @editor Maxime Sotsky 3637964
 */
public class Grade {

	/** name - course name */
    private String name;
    /** credit - amount of credit hours */
    private int credit;
    /** gp - grade points for course */
    private float gp;
    /** letter -letter grade for course */
    private String letter;

    /**
     * Grade constructor to be used in transcript
     * @param name -the name of the course
     * @param credit -the credit hours of the course
     * @param gp -the grade points of the course
     */
    public Grade (String name, int credit, float gp) {
        this.name = name;
        this.credit = credit;
        this.gp = gp;
        this.letter = Registrar.convertGrade(gp);
    }
    //@Overload
    public Grade(String name, int credit, String letter) {
    	this.name = name;
    	this.credit = credit;
    	this.letter = letter;
    	this.gp = Registrar.convertGrade(letter);
    }	

    /**
     * @return String course name
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return String letter grade
     */
    public String getLetter(){
        return this.letter;
    }

    /**
     * @return int credit hours
     */
    public int getCredit(){
        return this.credit;
    }
    
    /**
     * @return float grade point
     */
    public float getGp(){
        return this.gp;
    }

    /**
     * @return String - formatted course display
     */
    //@Override
    public String toString() {
        return this.name + " " + this.credit + "CH " + this.gp + " (" + this.letter + ")";
    }


}
