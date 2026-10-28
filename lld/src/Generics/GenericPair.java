package Generics;

import AdderSubtractor.Value;

public class GenericPair<V,T> {

	private V value1;
	private T value2;

	public V getValue1() {
		return value1;
	}

	public void setValue1(V value1) {
		this.value1 = value1;
	}

	public T getValue2() {
		return value2;
	}

	public void setValue2(T value2) {
		this.value2 = value2;
	}

	public <C> void printSomething(C val)
	{
		System.out.println("print: "+ val);
	}

	//static method is class level, its not on object level, so that V T only initialized in objects, so we can use that in static methods
	public static <X> void doSomething(X val)
	{
		System.out.println("Static Call : "+ val + 5);
	}

}
