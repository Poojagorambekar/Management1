package Welcome;

import java.util.Scanner;

import Admin.Admin;

public class Welcome_page {
	Scanner sc=new Scanner(System.in);
	Admin a=new Admin();
	public void display() 
	{
		System.out.println("*****Library Management Application*****");
		System.out.println("1.Login");
		System.out.println("2.Sign Up");
		System.out.println("3.Exit");
		System.out.println("Enter any option:");
		int choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1:a.Login();
		        display();
		        break;
		        
		        
		        
		 case 2:
			 a.signUp();
			 display();
			 break;
			 
			 
		 case 3:
			 System.out.println("Thank you for using the Library Management Application");
			 System.exit(0);
			 System.out.println("______________________________________________________________________________________________");
				
			 return;
	 
		 
		 
		 default:
			 System.out.println("Invalid choice please try again");
			 System.out.println("______________________________________________________________________________________________");
				
		
		 }   
		
		
		
	}

}
