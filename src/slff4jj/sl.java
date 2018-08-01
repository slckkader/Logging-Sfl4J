package slff4jj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class sl {
	private final Logger slf4jLogger = LoggerFactory.getLogger(sl.class);

	public void deneme(String name) {

		slf4jLogger.warn("Warn deneme");
		slf4jLogger.error("Error deneme");
	}

	public static void main(String[] args) {
		sl slck = new sl();
		slck.deneme("slck");
	}
}