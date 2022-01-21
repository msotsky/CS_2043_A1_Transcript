package assn1.mys;

import java.util.*;
/**
 * class representing a student transcript
 * @author Maxime Sotsky 3637964
 */
public class Transcript {
    
	/** final int -representing a student transcript by ID */
    private final int id;
    /** ArrayList -representing the current grades/courses in trancript */
    private ArrayList<Grade> grades = new ArrayList<Grade>();

    /**
     * Transcript constructor
     * @param id -the student unique ID
     */
    public Transcript(int id){
        this.id = id;
    }

    /**
     * Add a grade to ArrayList (adding grade to transcript)
     * @param grade -the grade to be added
     */
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    
    /**
     * remove a grade from ArrayList (removing grade from transcript) by name
     * @param name - removing all the grades with the Name name
     */
    public void removeGradeName(String name){
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i).getName().equals(name)){
                grades.remove(i);
            }
        }
    }

    /**
     * remove a grade from ArrayList (removing grade from transcript) by letter grade
     * @param grade - removing all the grades with the letter Grade grade
     */
    public void removeGradeLetter(String grade){
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i).getLetter().equals(grade)){
                grades.remove(i);
            }
        }
    }

    /**
     * toString method to neatly print a student with GPA
     * @param String -the string representing the student and GPA
     */
    @Override
    public String toString(){
        return "Student " + this.id + ": GPA " + Registrar.getGPA(grades);
    }

    /**
     * method to print out entire student transcript displaying the grades
     */
    public void printTranscript(){
        System.out.println(this.toString());
        for(Grade g : grades){
            System.out.println(g.toString());
        }
    }
}
