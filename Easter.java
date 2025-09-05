// Ryan Kim
// This project will calculate the date easter falls on a given year

import java.util.*;

public class Easter {
    public static void main(String[] args) {
        int y = 2025;
        int a = y % 19;
        int b = y/100;
        int c = y % 100;
        int d = b/4;
        int e = b % 4;
        int f = (b+8)/25;
        int g = (b-f+1)/3;
        int h = (19 * a + b - d - g +15) % 30;
        
        
        
    }
}
