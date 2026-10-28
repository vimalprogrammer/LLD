package Mutex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {

	private int maxSize;
	private List<Object> items;


	public Store(int maxSize)
	{
		this.maxSize = maxSize;
		this.items = new ArrayList<>();
	}

	public int getMaxSize()
	{
		return maxSize;
	}

	public void setMaxSize(int maxSize)
	{
		this.maxSize = maxSize;
	}

	public List<Object> getItems()
	{
		return items;
	}

	public void addItem(Object item)
	{
		System.out.println("Item Produced : "+ items.size());
		items.add(item);
	}

	public void removeItem()
	{
		System.out.println("Item Consumed : "+ (items.size()-1));
		items.remove(items.size()-1);
	}


}
