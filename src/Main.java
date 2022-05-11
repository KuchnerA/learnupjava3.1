import kuchner.homework.finance.BankUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String name = "Maxim";
        int[] amounts = {10_000, 20_000, 30_000, 40_000};

        int[] accruedInterest = BankUtils.calcAccruedInterest(26, amounts);   //amount_RUB

        System.out.println("Накопленные проценты: " + Arrays.toString(accruedInterest) + " RUB");

    }
}
