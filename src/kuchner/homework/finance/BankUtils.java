package kuchner.homework.finance;

public class BankUtils {
    static int targetAge = 60;

    public static int[] calcAccruedInterest(int age, int[] amounts) {

        int[] accruedInterest = new int[targetAge - age];
        int amount = 0;
        for (int i = 0; i < targetAge - age; i++) {
            if (i < amounts.length) {
                amount += amounts[i];
            }
            double rate = calcRate(age, amount);
            accruedInterest[i] = (int) (amount * rate / 100);
        }

        return accruedInterest;
    }

    public static double calcRate(int age, int amount) {

        double rate = 0;
        if (amount < 100_000) {
            rate = 5.0;
        } else if (amount >= 100_000 && amount <= 500_000) {
            rate = 6.0;
        } else if (amount > 500_000) {
            rate = 7.0;
        }

        if ((targetAge - age) >= 20) {
            rate = rate + 0.5;
        }
        return rate;
    }
}
