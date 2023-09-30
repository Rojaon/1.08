package d4.BigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal("4.2545");
        System.out.println(toNearestHundredth(b1));

        BigDecimal b2 = new BigDecimal("1.2345");
        BigDecimal b3 = new BigDecimal("-45.67");
        System.out.println(reverses(b2) + " " + reverses(b3));

    }


    public static double toNearestHundredth(BigDecimal number){
        double nearestHundredth = Double.parseDouble(String.valueOf(number.setScale(2, RoundingMode.HALF_UP)));
        return nearestHundredth;
    }
    public static double reverses(BigDecimal number){
        BigDecimal newNumber = number.negate();
        double reversesNumber = Double.parseDouble(String.valueOf(newNumber.setScale(1, RoundingMode.HALF_UP)));
        return reversesNumber;
    }
}
