package RA01;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán từ bàn phím : ");
        float scoreMath = sc.nextFloat();
        System.out.println("Nhập điểm môn Văn từ bàn phím ");
        float scoreLiterature = sc.nextFloat();
        System.out.println("Nhập điểm môn Tiếng Anh từ bàn phím");
        float scoreEnglish = sc.nextFloat();

        float scoreAverage = (scoreLiterature + scoreEnglish + scoreMath) / 3;
        System.out.println("Điểm trung bình của 3 môn Toán, Văn, Anh là : " + scoreAverage);
    }
}
