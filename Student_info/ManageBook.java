package Student_info;

import java.util.Scanner;

public class ManageBook {
	private String[] bookNames;
    private boolean[] isIssued;
    private String[] issuedToStudents;
     

   
    Scanner sc = new Scanner(System.in);
    private Book book;
 

    public ManageBook(Book book) {
        int numOfBooks = 5;
        bookNames = new String[numOfBooks];
        isIssued = new boolean[numOfBooks];
        issuedToStudents = new String[numOfBooks];
        this.book=book;
        
       
    }

    public void addBooks() {
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print("Enter the book name : ");
            String name = sc.next();

            bookNames[i] = name;
            isIssued[i] = false;
            issuedToStudents[i] = "";
        }
        System.out.println("Book information added successfully!");
    }

    public void displayBooks() {
        System.out.println("Books Available in Library ");
        for (int i = 0; i < bookNames.length; i++) {
            if (!isIssued[i]) {
                System.out.println(" " + (i + 1) + ")" + bookNames[i]);
            }
        }
    }
    public void issueBook() {
    	System.out.println("Enter student Roll_No:");
        String studentRollNo = sc.next();

        System.out.println("Enter book name:");
        String bookName = sc.next();
        boolean bookIssued=book.issueBook(bookName);
        

       
        if (bookIssued) {
            
            for (int i = 0; i < bookNames.length; i++) {
                if (bookNames[i] != null && bookNames[i].trim().equalsIgnoreCase(bookName.trim())) {
                    isIssued[i] = true;
                    issuedToStudents[i] = studentRollNo;
                    break; 
                }
            }
            
         
          System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book not found in the library!");
        }
    } 
	 
public void returnBook() {
    System.out.println("Enter student Roll_No:");
    String studentRollNo = sc.next();

    System.out.println("Enter book name:");
    String bookName = sc.next();

    boolean bookReturned = book.returnBook(bookName);

    if (bookReturned) {
        for (int i = 0; i < bookNames.length; i++) {
            if (bookNames[i] != null && bookNames[i].trim().equalsIgnoreCase(bookName.trim())) {
                isIssued[i] = false;
                issuedToStudents[i] = "";
                break;
            }
        }

        System.out.println("Book returned successfully!");
    } else {
        System.out.println("Book not found in the library or not issued to the given student!");
    }
}
}