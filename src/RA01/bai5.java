package RA01;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;
        System.out.println("Nhập bán kính hình tròn từ bàn phím");
        float radius = sc.nextFloat();
        float periMeter = 2 * PI * radius;
        float area = PI * radius * radius;
        System.out.println("Chu vi của hình tròn là : " + periMeter);
        System.out.println("Diện tích của hình tròn là : " + area);
    }
}
