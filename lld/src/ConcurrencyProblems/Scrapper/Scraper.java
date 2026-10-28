package ConcurrencyProblems.Scrapper;

import java.util.concurrent.Callable;

public class Scraper implements Callable<Void> {

	private String url;

	Scraper(String url)
	{
		this.url = url;
	}

	@Override
	public Void call() throws Exception {
		Thread.sleep(200);
		return null;
	}
}
