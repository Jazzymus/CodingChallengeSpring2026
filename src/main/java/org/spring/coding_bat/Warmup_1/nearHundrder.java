package org.spring.coding_bat.Warmup_1;

public class nearHundrder {
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
