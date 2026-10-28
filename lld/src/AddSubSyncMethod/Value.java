package AddSubSyncMethod;

public class Value {

	private int x;

	public int getX()
	{
		return this.x;
	}

	Value(int x)
	{
		this.x = x;
	}

	public synchronized void syncIncValue(int offset)
	{
		this.x += offset;
	}
}
