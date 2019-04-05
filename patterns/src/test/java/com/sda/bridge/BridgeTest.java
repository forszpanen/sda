package com.sda.bridge;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BridgeTest {

    @Test
    public void shouldPerformOperation() {
        SimpleAccount account = new SimpleAccount(100);
        account.withdraw(75);
        assertTrue(account.hasLastOperationSuccedded());
        account.withdraw(10);
        assertTrue(account.hasLastOperationSuccedded());
        account.withdraw(100);
        assertFalse(account.hasLastOperationSuccedded());
    }
}
