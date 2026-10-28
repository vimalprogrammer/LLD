package Semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

	private int maxSize;
	private ConcurrentLinkedDeque<Object> items;


	public Store(int maxSize)
	{
		this.maxSize = maxSize;
		this.items = new ConcurrentLinkedDeque<>();
	}

	public int getMaxSize()
	{
		return maxSize;
	}

	public void setMaxSize(int maxSize)
	{
		this.maxSize = maxSize;
	}

	public ConcurrentLinkedDeque<Object> getItems()
	{
		return items;
	}

	public void addItem(Object item) {
		items.add(item);
		System.out.println("Item Produced. Current size: " + items.size());
	}

	public void removeItem() {
		items.remove();
		System.out.println("Item Consumed. Current size: " + items.size());
	}
}
