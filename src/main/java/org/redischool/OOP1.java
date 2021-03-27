package org.redischool;

public class OOP1 {
    Account giveMeYourAccount() {
        Account me = new Account();
        // Deposit 100 on the account
        return me;
    }

    Account giveMeYourFriendsAccount() {
        Account friend = new Account();
        // Deposit 200 on the account
        return friend;
    }

    void giveYourFriend50(Account you, Account friend) {
        // transfer 50 to your friend
    }

    public void withdraw10(Account you) {
        // withdraw 10 from your account
    }

    void preventOverdraft(Account you, double withdrawAmount) {
        // withdraw the given amount from your account
        // your account should make sure only this amount
        // is withdrawn
    }

}
