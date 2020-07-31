package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LeapYearShould {

  private LeapYear leapYear;

  @BeforeEach
  void setUp() {
    leapYear = new LeapYear();
  }

  @ParameterizedTest
  @CsvSource({
      "1997, false",
      "1996, true",
      "1600, true",
      "1800, false",
      "1700, false",
      "2000, true",
      "2004, true"
  })
  void return_false_for_year_not_divisible_by_4(int input, boolean output) {
    assertEquals(output, leapYear.check(input));
  }
}
