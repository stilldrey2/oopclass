package booktest;
import java.util.Scanner;

class Book{
	String title;
	String author;
	int numberOfPages;
}

public class booktest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Book one = new Book();
		System.out.println("Please enter the title of the book");
		one.title= in.nextLine();
		System.out.println("Please enter the author name");
		one.author = in.nextLine();
		System.out.println("Please enter the number of pages");
		one.numberOfPages = in.nextInt();
		
		System.out.println("The book title is: " +one.title);
		System.out.println("The author is: " +one.author);
		System.out.println("The book has " +one.numberOfPages);
		

	}

}