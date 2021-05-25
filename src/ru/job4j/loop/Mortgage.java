package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        double loanDebt = amount + (amount * percent) / 100;
        while (salary < loanDebt) {
            year++;
            loanDebt = (loanDebt - salary) + (loanDebt - salary) * (percent) / 100;

        }

        return year;
    }

}
