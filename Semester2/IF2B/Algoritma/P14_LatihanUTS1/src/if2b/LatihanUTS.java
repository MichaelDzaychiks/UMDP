package if2b;

import java.util.Scanner;

class Transaksi_Michael{
	String kodeTransaksi;
	int jumlahBeli;
	double harga,totalHarga,pajak,totalBayar;
}


public class LatihanUTS {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int banyak = 0;
		System.out.print("Masukkan banyak Transaksi = ");
		banyak = sc.nextInt();
		sc.nextLine();
		
		System.out.println("--------------------------------------------");
		
		Transaksi_Michael[] transaksi = new Transaksi_Michael[banyak];
		
		for(int i = 0; i < banyak; i++) {
			transaksi[i] = new Transaksi_Michael();
			
			System.out.println("Data ke-" + (i+1));
			
			System.out.print("Masukkan kode trx: ");
			transaksi[i].kodeTransaksi = sc.nextLine();
			
			System.out.print("Masukkan jumlah beli: ");
			transaksi[i].jumlahBeli = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Masukkan harga: ");
			transaksi[i].harga = sc.nextDouble();
			sc.nextLine();
			
			transaksi[i].totalHarga = transaksi[i].jumlahBeli * transaksi[i].harga;
			transaksi[i].pajak = 0.11 * transaksi[i].totalHarga;
			transaksi[i].totalBayar = transaksi[i].totalHarga + transaksi[i].pajak;
			
			System.out.println("Total Harga: Rp." + transaksi[i].totalHarga);
			System.out.println("Pajak 11% : Rp." + transaksi[i].pajak);
			System.out.println("Total Bayar: Rp."+transaksi[i].totalBayar);
			
			sorting(transaksi,transaksi.length);
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("Kd Trx \t Jumlah Beli \t Harga Satuan \t Pajak \t Total Bayar");
			System.out.println("----------------------------------------------------------------");
			for (int i = 0; i < banyak; i++) {
				System.out.println(transaksi[i].kodeTransaksi  +"\t\t" + 
								   transaksi[i].jumlahBeli+"\t\t" + 
								   (int)transaksi[i].harga  +"\t" + 
								   (int)transaksi[i].pajak  +"\t" +  
								   (int)transaksi[i].totalBayar  +"\t");
			}
			System.out.print("\n Masukkan harga yang dicari: ");
//			cari = nextLine();
			
//			int hasilSearching = searching_BinarySearch();
//			if(hasilSearching == -1) {
//				System.out.println("hasil Pencarian: False");
//			} else {
//				System.out.println("Hasil Pencarian: True");
//			}
		}
	}

	public static void sorting(Transaksi_Michael[] transaksi, int length, int n) {
		for(int i = 0; i < n-1; i++) { //jumlah iterasi = n -1
			for(int j = i+1; j < n; j++) { //data yang dibandingkan 
				if(transaksi[i].totalBayar > transaksi[j].totalBayar) { //pertukaran elemen1 > elemen 2 TUKAR) 
					Transaksi_Michael temp = transaksi[i];
					transaksi[i] = transaksi[j];
					transaksi[j] = temp;
				}
			}
		}
	}
	
	public static void searching_BinarySearch(Transaksi_Michael[] data(int first, int last, double cari)) {
		
	}

}
