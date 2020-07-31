package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class YearShould {
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
  void return_correct_check_for_leap_year(int input, boolean output) {
    assertEquals(output, newYear(input).check());
  }

  private Year newYear(int input) {
    return new Year(input);
  }
}
