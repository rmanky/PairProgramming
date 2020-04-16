package edu.wpi.teamname;

public class FizzBuzz {

  public FizzBuzz() {}

  public String answer(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "fizzbuzz";
    } else if (number % 3 == 0) {
      return "fizz";
    } else if (number % 5 == 0) {
      return "buzz";
    } else {
      return String.valueOf(number);
    }
  }
}
