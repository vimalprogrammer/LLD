package InterfaceExample;

//Interfaces used to enforce a contract

//1. Interface dont have variables as abstract classes have

//2.Interface -> Behaviour
//abstract class -> Nouns(builds a hierarchy)

//for eg: Birds class -> Penquin ex Birds and Sparrow ex Birds
//Is we declare  a method called fly in birds ofc not, since penquin not fly
//So we create an interface called Flyable and declare fly method there and use it penquin

// Abstract class -> Defines what a bird IS (Noun)
abstract class Bird {

	String name;

	Bird(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating");
	}
}

// Interface -> Defines a behaviour (Verb)
interface Flyable {
	void fly();
}

// Sparrow IS A Bird and CAN Fly
class Sparrow extends Bird implements Flyable {

	Sparrow() {
		super("Sparrow");
	}

	@Override
	public void fly() {
		System.out.println("Sparrow is flying");
	}
}

// Penguin IS A Bird but CANNOT Fly
class Penguin extends Bird {

	Penguin() {
		super("Penguin");
	}
}

public class Main {
	public static void main(String[] args) {

		Sparrow sparrow = new Sparrow();
		sparrow.eat();
		sparrow.fly();

		System.out.println();

		Penguin penguin = new Penguin();
		penguin.eat();
	}
}