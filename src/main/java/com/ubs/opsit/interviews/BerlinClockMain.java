package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BerlinClockMain {
	
	public static void main(String[] args) throws Exception {

		Logger logger = LoggerFactory.getLogger(BerlinClockMain.class);
	
		BerlinClock clock = new BerlinClock(args[0]);
		logger.info("====== Berlin Clock ======");
		clock.printClock();
		logger.info("==========================");

	}

}
