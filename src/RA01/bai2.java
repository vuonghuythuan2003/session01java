package RA01;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double moneyVN = 24.589;
        System.out.println("Vui lòng nhập số tiền USD mà bạn muốn đổi");
        Double moneyUsd = scanner.nextDouble();
        Double totalAmount = moneyUsd * moneyVN;
        System.out.println("Số tiền sau khi bạn đổi là : " + totalAmount);
    }
}
