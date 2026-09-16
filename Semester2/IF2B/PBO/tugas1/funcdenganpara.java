import java.util.Scanner;

public class funcDenganPara {

    public static double hitungVolumeFungsiDenganParameter(double a, double t, double tp) {
        return (0.5 * a * t) * tp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan alas: ");
        double A = sc.nextDouble();
        
        System.out.print("Masukkan tinggi: ");
        double T = sc.nextDouble();
        
        System.out.print("Masukkan tinggi prisma: ");
        double Tp = sc.nextDouble();

        double hasil1 = hitungVolumeFungsiDenganParameter(A, T, Tp);
        
        System.out.println("Fungsi dengan parameter: " + hasil1);
        
        sc.close();
    }
}
