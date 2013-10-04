package book;

import book.Book;

public class Main
{
	public static void main(String[] args)
	{
		Book objava = new Book("Objects first with java", "David barnes and Michael Kölling", 80f, (short) 2013);
		System.out.println("Title: " + objava.getTitle());
		System.out.println("Author: " + objava.getAuthor());
		System.out.println("Price: " + objava.getPrice());
		System.out.println("Year of purchace: " + objava.getYear());
		objava.setPrice(70f);
		System.out.println("Title: " + objava.getTitle());
		System.out.println("Author: " + objava.getAuthor());
		System.out.println("Price: " + objava.getPrice());
		System.out.println("Year of purchace: " + objava.getYear());
		
		Book lshort = new Book("The not so short introduction to LaTeX 2e", "Tobias Oetiker");
		System.out.println("Title: " + lshort.getTitle());
		System.out.println("Author: " + lshort.getAuthor());
		System.out.println("Price: " + lshort.getPrice());
		System.out.println("Year of purchace: " + lshort.getYear());
		lshort.setYear((short) 2011);
		System.out.println("Title: " + lshort.getTitle());
		System.out.println("Author: " + lshort.getAuthor());
		System.out.println("Price: " + lshort.getPrice());
		System.out.println("Year of purchace: " + lshort.getYear());
		
	}
}
