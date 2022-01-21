package assn1.mys;

/**
 * driver class to test Transcript, Registrar, and Grade classes
 * @author Maxime Sotsky 3637964
 */
public class TranscriptDriver {
    
	/**
	 * The main method
	 * @param args
	 */
    public static void main(String[] args){
        
        //Grades
        Grade g1 = new Grade("CS1003", 4, "B");
        Grade g2 = new Grade("CS2033", 4, "A");
        Grade g3 = new Grade("ECE2213", 4, 3.3f);
        Grade g4 = new Grade("ECON1001", 3, 2.0f);
        Grade g5 = new Grade("CS2033", 4, "B");

        //Create a transcript with student ID 8510804
        Transcript transcript = new Transcript(8510804);

        //Add the following grades to the transcript:
        transcript.addGrade(g1);
        transcript.addGrade(g2);
        transcript.addGrade(g3);
        transcript.addGrade(g4);
        transcript.addGrade(g5);

        //print the transcript in the console:
        transcript.printTranscript();

        System.out.println("---------------------");

        //Remove the grade with properties CS2033 and B
        transcript.removeGradeName("CS2033");
        transcript.removeGradeLetter("B");

        //Print the transcript again
        transcript.printTranscript();

        System.out.println("---------------------");

        //Add the following grade to the transcript: CS2033 B 
        //(ie add the grade that you removed back in)
        transcript.addGrade(g5);
        
        //Remove all the grades with the properties CS2033
        transcript.removeGradeName("CS2033");

        //Print the transcript again
        transcript.printTranscript();

        System.out.println("---------------------");

        //create a transcript with student ID 8510805
        Transcript transcript2 = new Transcript(8510805);

        //print the transcript in the console:
        transcript2.printTranscript();

    }
}

