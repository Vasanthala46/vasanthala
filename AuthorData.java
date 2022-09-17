package com.Author.demo;

public class AuthorData{

	public static void main(String[] args) {
		
		Author a1 = new Author("William " ,"Shakespeare");
		Author a2 = new Author ("Jhon" ,"donny");
				
		System.out.print(a1.getFirstName());
		System.out.println(a1.getLastname());

		System.out.println(a2.toString());
				
		Author a4;
//		System.out.println(a4);
		a4=a1;
		
		System.out.println(a4);
		
	}



}
