package com.jvckmorvn;

public class App {
  public static void main(String[] args) {
    int principal = (int)Console.readNumber("Principal: ", 1000, 1_000_000);
    float annualInterest = (float)Console.readNumber("Annual Interest Rate: ", 1, 30);
    byte years = (byte)Console.readNumber("Period (Years): ", 1, 30);

    Calculator calculator = new Calculator(principal, annualInterest, years);
    MortgageReport report = new MortgageReport(calculator);

    report.printMortgage();
    report.printPaymentSchedule();
  }
}
