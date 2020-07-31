package com.codurance;

public class LeapYear {

  public boolean check(int input) {
    if (((input % 4 == 0) && (input % 100 == 0) && !(input % 400 == 0))){
      return false;
    }
    return input % 4 == 0;
  }
}
