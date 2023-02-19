import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r,a,alan;
        System.out.print("dairenin yarıçapını giriniz=");
        r=input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz=");
        a=input.nextDouble();
        alan=3.14*r*r*a/360;
        System.out.print("dairenin alanı="+alan);
    }
}