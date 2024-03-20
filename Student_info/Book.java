package Student_info;

import java.util.Scanner;

public class Book {
	private String[] bookNames;
	Scanner sc=new Scanner(System.in);
	public Book(int numOfBooks)
	{
		bookNames=new String[numOfBooks];
	}
    
    public void addBooks()
    {
 	   int numOfBooks = 5;
        bookNames = new String[numOfBooks];
       

        for (int i = 0; i < numOfBooks; i++) {
            System.out.print("Enter the book name : ");
            String name = sc.next();
          

            bookNames[i] = name;
           
        }
        System.out.println("Book information added successfully!");
    }
    public void DisplayBooks() {
	      System.out.println("Books Available in Library ");
	    for (int i = 0; i < bookNames.length; i++) {
	        System.out.println(" " + (i+1)+")"+bookNames[i]);
	      
	      
	    }
	}
    public boolean issueBook(String bookName) {
        for (int i = 0; i < bookNames.length; i++) {
            if (bookNames[i] != null && bookNames[i].trim().equalsIgnoreCase(bookName.trim())) {
                bookNames[i] = null;
                return true;
            }
        }
        return false;
    }
  

public boolean returnBook(String bookName) {
    for (int i = 0; i < bookNames.length; i++) {
        if (bookNames[i] == null) continue;

        if (bookNames[i].trim().equalsIgnoreCase(bookName.trim())) {
            System.out.println("Enter student Roll_No for returning the book:");
            String studentRollNo = sc.next();

            // You can add additional validation here to ensure the book is being returned by the correct student.
            // For simplicity, I'm assuming the book is returned without further validation.

            bookNames[i] = bookName;
            return true;
        }
    }
    return false;
}
}

