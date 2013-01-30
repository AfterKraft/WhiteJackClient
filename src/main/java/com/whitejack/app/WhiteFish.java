package com.whitejack.app;

import org.apache.log4j.Logger;

public class WhiteFish extends WhiteClient {

	// initialize starting variables for startup
	// TODO: We have none yet.
	private static Logger log = Logger.getLogger("WhiteFish");

	// main thread to start application
	public static void main(String[] args) {

		// Print Activation messages for debugging
		log.info("====================\n" + "Welcome to WhiteFish\n");
		log.info("\n");
	}

}
