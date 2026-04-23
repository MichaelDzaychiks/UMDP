package if2b;

import java.util.Arrays;
import java.util.Scanner;

class Mahasiswa{
	String nama;
	double nilai;
	
	public Mahasiswa(String nama, double nilai) {
		this.nama = nama;
		this.nilai = nilai;
	}
}

public class Latihan_Sorting_Searching {
	static Scanner sc = new Scanner(System.in);
	
	public static void sorting(Mahasiswa[] data,int n) {
//		shellsort berdasarkan nilai ascending
		for(int gap = n/2; gap > 0; gap = gap/2) {
			for(int i = gap; i < n; i++) {
				Mahasiswa temp = data[i];
				int j;
				for(j = i; j >= gap && data[j-gap].nilai > temp.nilai; j = j-gap) {
					data[j] = data[j-gap];
				}
				data[j] = temp;
			}
		}
	}
	
	public static int searching_LinearSearch(Mahasiswa[] data,int index,String cari) {
//		pencarian data mahasiswa berdasarkan nama
		if(index >= data.length) {
			return -1;
		} else if(data[index].nama.equals(cari)) {
			return index;
		} else {
			return searching_LinearSearch(data, index+1, cari);
		}
	}
	
	public static int searching_BinarySearch(Mahasiswa[] data,int first, int last, double cari) {
//		pencarian data mahasiswa berdasarkan nilai
		Arrays.sort(data);
		if(last >= first) {
			int midpoint = (first + last) / 2;
			if(data[midpoint].nilai < cari) {
				return midpoint;
			} else if(data[midpoint].nilai < cari) {
				return searching_BinarySearch(data, midpoint+1, last, cari);
			} else { 
				return searching_BinarySearch(data, first, midpoint-1, cari);
			}
		} else { 
			return -1;
		}
	}
	
	public static void inputData(Mahasiswa[] mhs) {
        String nama;
        double nilai;

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa " + (i+1));

            System.out.print("Masukan Nama : " );
            nama = sc.nextLine();

            System.out.print("Masukan Nilai : ");
            nilai = sc.nextInt();
            sc.nextLine();

            mhs[i] = new Mahasiswa(nama,nilai);
        }
    }
	
	public static void tampilData(Mahasiswa[] mhs) {
        System.out.println("Data Mahasiswa");
        System.out.println("No \t Nama \t Nilai");
        for(int i = 0;  i < mhs.length; i++) {
            System.out.println((i+1) + "\t" + mhs[i].nama + (int) mhs[i].nilai);
        }
    }
	
	public static void main(String[] args) {
		int banyak = 0, cariNilai,hasilNama;
		String cariNama;
        System.out.print("Masukkan Banyak Mahasiswa = ");
        banyak = sc.nextInt();
        sc.nextLine();

        Mahasiswa[] mhs = new Mahasiswa[banyak];
        inputData(mhs);

        System.out.println("Data Awal = ");
        tampilData(mhs);

        sorting(mhs, mhs.length);

        System.out.println("\nData Setelah Pengurutan Berdasarkan Nilai Asc = ");
        tampilData(mhs);
        
        System.out.println("Masukkan nama yang dicari = ");
        cariNama = sc.nextLine();
        
        hasilNama = searching_LinearSearch(mhs, 0, cariNama);
        
        if(hasilNama == -1) {
        	System.out.println("Data tidak ditemukan");
        } else {
        	System.out.println("data mahasiswa ditemukan");
        	System.out.println("Nama = " + mhs[hasilNama].nama);
        	System.out.println("Nilai = " + (int) mhs[hasilNama].nilai);
        } 
	}

}
