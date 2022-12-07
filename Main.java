import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen malın kdv'siz tutarını giriniz");
        double tutar = input.nextDouble();
        if (tutar < 1000 && tutar > 0){
            double kdv = (tutar*0.18);
            System.out.println("kdv tutarınız " +kdv);
            System.out.println("ürünün güncel tutarı " + (kdv + tutar));
        }
        else {
            double kdv = (tutar*0.08);
            System.out.println("kdv tutarınız " + kdv);
            System.out.println("ürünün güncel tutarı " + (kdv+tutar));
        }
    }
}