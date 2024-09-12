package RA01;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập cạnh của hình vuông a vào : ");
        float squareEdge = scanner.nextFloat();
        float periMeter = squareEdge * 4;
        float area = squareEdge * 2;
        System.out.println("Chu vi của hình vuông là : " + periMeter);
        System.out.println("Diện tích của hình vuông là : " + area);
    }
}
