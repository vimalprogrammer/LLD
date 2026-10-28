package Generics;

//import java.awt.*;
import java.util.*;

public class Client {

	static void main() {
		Pair pair = new Pair();
		pair.x = 4;
		pair.y = 5;

		Pair sPair = new Pair();
		sPair.x = "Vimal";
		sPair.y = 4;

		System.out.println(sPair.x);

		GenericPair<String,Integer> genericPair = new GenericPair<>();
		genericPair.setValue1("Arun");
		genericPair.setValue2(9);
		System.out.println(genericPair.getValue1());

		//Before Java 5 generics - that awt
//		List list = new List();
//		list.add("Thulasi");
//		list.add("Ronaldo");

//		System.out.println(list.getItem(0));

		List<String> names = new ArrayList<>();

		//Generic for any type
		genericPair.printSomething("Kishore");
		genericPair.printSomething(8);

		//static method called by class
		GenericPair.doSomething("Aswath");


	}
}
