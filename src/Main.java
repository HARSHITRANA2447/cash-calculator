package main.java;

import java.util.Scanner;

    class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        setCashValue(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        setMilesValue(milesValue);
    }

    // Private method to set the cash value and update the miles value
    private void setCashValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Private method to set the miles value and update the cash value
    private void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cash value: ");
        double cashValueInput = scanner.nextDouble();
        RewardValue reward1 = new RewardValue(cashValueInput);

        System.out.print("Enter miles value: ");
        int milesValueInput = scanner.nextInt();
        RewardValue reward2 = new RewardValue(milesValueInput);

        System.out.println("Reward1 Cash Value: " + reward1.getCashValue());
        System.out.println("Reward1 Miles Value: " + reward1.getMilesValue());
        System.out.println("Reward2 Cash Value: " + reward2.getCashValue());
        System.out.println("Reward2 Miles Value: " + reward2.getMilesValue());

        scanner.close();
    }
}
