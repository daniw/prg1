package book;

public class Book
{
	//Title
	private String title;
	//Author
	private String author;
	//Price
	private float price;
	//Year when the book was bought
	private short year;
	
	/*
	 * Create a book with a given title an author. The price and the year of 
	 * purchase are initiated with zero.  
	 */
	public Book(String titleInit, String authorInit)
	{
		title = titleInit;
		author = authorInit;
		price = 0.0f;
		year = -1;
	}
	
	/*
	 * Create a book with a given title, author, price and year of purchase. 
	 */
	public Book(String titleInit, String authorInit, float priceInit, short yearInit)
	{
		title = titleInit;
		author = authorInit;
		price = priceInit;
		year = yearInit;
	}
	
	/*
	 * returns the title of the book
	 */
	public String getTitle()
	{
		return title;
	}
	
	/*
	 * returns the author of the book
	 */
	public String getAuthor()
	{
		return author;
	}
	
	/*
	 * returns the year when the book was bought
	 */
	public short getYear()
	{
		return year;
	}
	
	/*
	 * set the year when the book was bought
	 */
	public void setYear(short yearSet)
	{
		year = yearSet;
	}
	
	/* 
	 * returns the price of the book
	 */
	public float getPrice()
	{
		return price;
	}
	
	/*
	 * set the price of the book
	 */
	public void setPrice(float cost)
	{
		price = cost;
	}
}