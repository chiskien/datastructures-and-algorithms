package chiskien.datastructures_algorithms.math;

public class CalculateMoneyInLeetCodeBank {

    //Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
    //He starts by putting in $1 on Monday, the first day.
    // Every day from Tuesday to Sunday, he will put in $1 more than the day before.
    // On every subsequent Monday, he will put in $1 more than the previous Monday.
    //Given n, return the total amount of money he will have in the Leetcode bank
    // at the end of the nth day.
    public static void main(String[] args) {
        CalculateMoneyInLeetCodeBank calculateMoneyInLeetCodeBank = new CalculateMoneyInLeetCodeBank();
        System.out.println(calculateMoneyInLeetCodeBank.totalMoney(7));
    }

    public int totalMoney(int n) {
        int total = 0;
        int weeks = n / 7;

        return total;
    }
}