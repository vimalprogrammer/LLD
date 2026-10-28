package Generics.User;

import java.util.List;

public class Utility {

	private static int counter = 0;
	public void printName(User u)
	{
		System.out.println("User Name : "+u.getUserName());
	}

	public void printNames(List<? extends User> users)
	{
		for(User u : users)
		{
			System.out.println("User No: " +(++counter) +" " + u.getUserName());
		}
	}
}
