package edu.wpi.teamname;

public class FizzBuzzWhiz {
  public FizzBuzzWhiz() {}

  public String answer(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "fizzbuzz";
    } else if (number % 3 == 0) {
      return "fizz";
    } else if (number % 5 == 0) {
      return "buzz";
    } else if (isPrime(number)) {
      return "whiz";
    } else {
      return String.valueOf(number);
    }
  }

  static boolean isPrime(int n) {
    // Corner case
    if (n <= 1) return false;

    // Check from 2 to n-1
    for (int i = 2; i < n; i++) if (n % i == 0) return false;

    return true;
  }
}
