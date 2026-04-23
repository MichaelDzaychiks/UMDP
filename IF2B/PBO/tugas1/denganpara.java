import java.util.Scanner;

public class denganpara {
    public static void hitungVolumeDenganParameter(double a, double t, double tp) {
        double VPrisma = (0.5 * a * t) * tp;
        System.out.println("Volume Prisma: " + VPrisma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double alas = sc.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tSegitiga = sc.nextDouble();
        
        System.out.print("Masukkan tinggi prisma: ");
        double tPrisma = sc.nextDouble();
        ;
        hitungVolumeDenganParameter(alas, tSegitiga, tPrisma);
        
        sc.close();
    }
}
