package org.timofeev.home.easy;

public class RichestCustomerWealth {

    // accounts.length >= 1
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customerAccounts : accounts) {
            int customerWealth = 0;
            for (int customerAccount : customerAccounts) {
                customerWealth += customerAccount;
            }
            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}
