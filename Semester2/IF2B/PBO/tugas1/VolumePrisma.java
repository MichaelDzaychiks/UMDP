import java.util.Scanner;

public class VolumePrisma {
    static double a, t, tp, VPrisma;

    public static void hitungVolumeTanpaParameter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan alas (a):");
        a = scanner.nextDouble();
        System.out.println("Masukkan tinggi (t):");
        t = scanner.nextDouble();
        System.out.println("Masukkan tinggi prisma (tp):");
        tp = scanner.nextDouble();

        VPrisma = (0.5 * a * t) * tp;
        System.out.println("Volume Prisma: " + VPrisma);
    }

    public static void main(String[]args){
        hitungVolumeTanpaParameter();
    }
}