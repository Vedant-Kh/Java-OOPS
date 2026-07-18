// book management system in java.
import java.util.Scanner;
class book{
    int bookId;
    String title;
    String author;
    int price;
    static String libraryname;
    static int bookcount = 0 ;

    book(int Id , String title , String author , int price){
        this.bookId = Id;
        this.title = title;
        this.author = author;
        this.price = price;
        bookcount++;
    }
     void displaybook(){
        System.out.println("Book Id: " + bookId );
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price" + price);
    }
    static void displayLibraryname(){
        System.out.println(libraryname);
    }
    static void displaybookcount(){
        System.out.println(bookcount);
    }
}
public class lib {
    public static void main(String[] args) {
        book.libraryname = "Chitkara Library";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of books: ");
        int n = sc.nextInt();
        book books[] = new book[n];
        for(int i =0 ; i<n ; i++){
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            System.out.print("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            books[i] = new book(id, name, author, price);
        }
        book.displayLibraryname();
        System.out.println();
        for(int k = 0 ; k<books.length ; k++){
            books[k].displaybook();
            System.out.println();
        }
        book.displaybookcount();
        sc.close();
    }
    
}

