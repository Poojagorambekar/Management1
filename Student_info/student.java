package Student_info;

import java.util.Scanner;

public class student {
	 private String[] studentNames;
	    private String[] studentRollNO;

	   
	       Scanner sc=new Scanner(System.in);
	       
	       public void addStudents()
	       {
	    	   int numOfStudents = 5;
	           studentNames = new String[numOfStudents];
	           studentRollNO = new String[numOfStudents];

	           for (int i = 0; i < numOfStudents; i++) {
	               System.out.print("Enter student name for student : ");
	               String name = sc.next();
	               System.out.print("Enter student Roll_NO for student : ");
	               String id = sc.next();

	               studentNames[i] = name;
	               studentRollNO[i] = id;
	           }
	           System.out.println("Student information added successfully!");
	       } 

	       
	       public void DisplayStudents() {
	    	      System.out.println("List of all Students and Roll_No ");
	    	      System.out.println("Roll_No\tName");
	    	    for (int i = 0; i < studentNames.length; i++) {
	    	    	 System.out.println(studentRollNO[i] + "\t" + studentNames[i]);
	    	      
	    	    }
	    	}
}



