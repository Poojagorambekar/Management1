package Admin;


import java.util.Scanner;

import Student_info.Book;
import Student_info.ManageBook;
import Student_info.student;

public class Admin {
    String Id="123";
	String Pass="123";
	Scanner sc= new Scanner( System.in);
    student student1=new student();
    Book book1= new Book(5);
    ManageBook book2=new ManageBook(book1);
    public void signUp() {
        System.out.println("Sign Up page");
        System.out.println("Enter  Id");
        String newId = sc.next();

        
        if (Id.equals(newId)) {
            System.out.println("Id already exists. Please try again with a different Id.");
            System.out.println();
            return;
            
        }

        System.out.println("Enter Password");
        String newPassword = sc.next();
        if(Pass.equals(newPassword))
        {
        	
        	 System.out.println("Password is already exists. Please try again with a different Password.");
             System.out.println();
             return;
        }

        
        Id = newId;
        Pass = newPassword;

        System.out.println("Sign Up successful. You can now log in with your new credentials.");
        System.out.println();
        
        System.out.println("______________________________________________________________________________________________");
    }
       
		
	
	public void Login()
	{
		System.out.println("Login page");
		System.out.println("Enetr Id");
		String a=sc.next();
		System.out.println("Enter Password");
		String b=sc.next();
		
		if(Id.equals(a)&& Pass.equals(b))
		{
			 System.out.println();
			 System.out.println("Login successful: welcome Admin");
			 System.out.println("______________________________________________________________________________________________");
				
			 
			 System.out.println();
			 
			 adminPage();
			
		}
		else
		{
			System.out.println("You have entered incorrect id or password login Unsucssesful");
			System.out.println("______________________________________________________________________________________________");
			
			 System.out.println();
			
		
		
		}
		 System.out.println("______________________________________________________________________________________________");
		
	}
	
	
	
	
		 private void adminPage() {
		        while (true) {
		            System.out.println("*****Admin Page*****");
		            System.out.println("1. Student Records");
		            System.out.println("2. Book Records");
		            System.out.println("3. Manage Records");
		            System.out.println("4. Exit");
		            System.out.print("Enter any option: ");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:StudentRecords();
		                System.out.println("______________________________________________________________________________________________");
		                    break;
		                case 2:
		                	 BookRecords();
		                	 System.out.println("______________________________________________________________________________________________");
		                    break;
		                case 3:
		                	ManageBooks();
		                	 System.out.println("______________________________________________________________________________________________");
		                    break;
		                case 4:
		                    System.out.println("Exiting Admin Page. Returning to Main Menu.");
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		        
		        
		    }
		 
		 private void StudentRecords() {
		        while (true) {
		        	 System.out.println("______________________________________________________________________________________________");
		            System.out.println("*****Student Records*****");
		            System.out.println("1. Add Students");
		            System.out.println("2. Display All Students");
		            System.out.println("3. Exit");
		            System.out.print("Enter any option: ");
		            int ch = sc.nextInt();

		            switch (ch) {
		                case 1:
		                   student1.addStudents();
		                   
		                    break;
		                case 2:
		                    student1. DisplayStudents();
		                    
		                    break;
		                case 3:
		                    System.out.println("Exiting Student Records. ");
		                    
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }
		 

	 private void BookRecords() {
	        while (true) {
	        	 System.out.println("______________________________________________________________________________________________");
	            System.out.println("*****Books Page*****");
	            System.out.println("1. Add Books");
	            System.out.println("2. Display All Books");
	            System.out.println("3. Exit");
	            System.out.print("Enter any option: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                  book1.addBooks();
	                  
	          		
	                  
	                    break;
	                case 2:
	                  book1.DisplayBooks();
	                  
	          		
	                    break;
	                case 3:
	                	System.out.println("Exitsting book records");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	 private void ManageBooks()
	 {
		 while (true) {
			 System.out.println("______________________________________________________________________________________________");
	            System.out.println("***** Manage Books Page*****");
	            System.out.println("1. Issues Books");
	            System.out.println("2. Return Books");
	            System.out.println("3. Exit");
	            System.out.print("Enter any option: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                	 book2.issueBook();
	                    break;
	                case 2:
	                	book2.returnBook();
	                	
	                    break;
	                case 3:
	                    System.out.println("Exiting Book Records. ");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
		 
	 }		 		 
		    
}


