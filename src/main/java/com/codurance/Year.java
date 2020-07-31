package com.codurance;

public class Year {

  private int year;

  public Year(int year) {
    this.year = year;
  }

  public boolean check() {
    return isDivisibleBy(4) && !((isDivisibleBy(100)) && (year % 400 != 0));
  }

  private boolean isDivisibleBy(int number) {
    return year % number == 0;
  }
}
