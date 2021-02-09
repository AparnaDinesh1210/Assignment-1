package assignment3;

import java.util.Scanner;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
    public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book
{
	private String category;

	public EngineeringBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

public class BookDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Book number is : ");
		int bookNo=sc.nextInt();
		System.out.println("Book title is : ");
		String title=sc.next();
		System.out.println("Author of the book : ");
		String author=sc.next();
		System.out.println("Price of the book is : ");
		Float price=sc.nextFloat();
		
		EngineeringBook eb = new EngineeringBook();
		System.out.println("Category of book : ");
		String category=sc.next();
		
	}

}
