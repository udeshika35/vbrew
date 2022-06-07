package com.sew.vbrew;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VBrewApplication {

  private static final Logger l = LoggerFactory.getLogger(VBrewApplication.class);
  public static void main(String[] args) {
    int a = 6;
    int g = 8;

    l.info("val {}", a*g);
  }
}
