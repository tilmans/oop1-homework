package org.redischool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void accountsTest() {
        OOP1 oop1 = new OOP1();

        // Check that accounts are created
        Account you = oop1.giveMeYourAccount();
        Account friend = oop1.giveMeYourFriendsAccount();
        assertNotNull(you, "I need your account");
        assertEquals(100, you.balance, "You should have 100");
        assertNotNull(friend, "I need your friends account");
        assertEquals(200, friend.balance, "Your friend should have 200");

        // Give your friend some money
        oop1.giveYourFriend50(you, friend);
        assertEquals(50, you.balance, "You should have 50");
        assertEquals(250, friend.balance, "Your friend should have 150");

        // Withdraw some money
        oop1.withdraw10(you);
        assertEquals(40, you.balance, "You should have 40 left");

        // Make sure I can't withdraw more than available
        oop1.preventOverdraft(you, 100);
        assertEquals(40, you.balance, "Should still be 40 because you can't withdraw 100");
    }
}