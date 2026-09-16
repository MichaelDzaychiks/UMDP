import java.util.Scanner;

public class functanpapara {
    static Scanner scanner = new Scanner(System.in);

    public static double hitungVolumeFungsiTanpaParameter() {
        double a, t, tp;
        double VPrisma;

        System.out.println("Masukkan (a):");
        a = scanner.nextDouble();

        System.out.println("Masukkan (t):");
        t = scanner.nextDouble();

        System.out.println("Masukkan (tp):");
        tp = scanner.nextDouble();

        VPrisma = (0.5 * a * t) * tp;
        
        System.out.println("Volume prisma adalah: " + VPrisma);

        return VPrisma;
    }

    public static void main(String[] args) {
        double hasil = hitungVolumeFungsiTanpaParameter();
        
        System.out.println("Hasil perhitungan volume adalah: " + hasil);
    }
}
