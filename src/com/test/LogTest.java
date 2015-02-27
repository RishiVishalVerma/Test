package com.test;

import org.apache.log4j.Logger;

public class LogTest {
	static Logger logger = Logger.getLogger(LogTest.class);

	public static void main(String[] args) {
		System.out.println("in action");
		logger.info("in action");
	}
}