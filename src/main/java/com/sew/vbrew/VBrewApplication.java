package com.sew.vbrew;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VBrewApplication {

  private static Logger logger = LoggerFactory.getLogger(VBrewApplication.class);

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = a * b;
    logger.info("c {}", c);
  }
}
