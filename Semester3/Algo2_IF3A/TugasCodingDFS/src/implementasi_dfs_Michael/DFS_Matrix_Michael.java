package implementasi_dfs_Michael;

import java.util.*;

class DFS_Michael{
	private final int jumlahSimpul_Michael;
	private final boolean[][] matrixKetetanggaan_Michael;
	
//	konstruktor
	public DFS_Michael(int totalSimpul_Michael) {
		this.jumlahSimpul_Michael = totalSimpul_Michael;
		this.matrixKetetanggaan_Michael = new boolean[totalSimpul_Michael][totalSimpul_Michael];
	}
	
//	ValidasiSimpul
	private void validasiSimpul_Michael(int nomorSimpul_Michael) {
		if(nomorSimpul_Michael < 0 || nomorSimpul_Michael >= jumlahSimpul_Michael) {
			throw new IllegalArgumentException("Simpul " + nomorSimpul_Michael + "diluar Jangkauan Graf");
		}
	}
//	TambahSisi
	public void tambahSisi_Michael(int simpulAwal_Michael, int simpulAkhir_Michael) {
		validasiSimpul_Michael(simpulAwal_Michael);
		validasiSimpul_Michael(simpulAkhir_Michael);
		
		matrixKetetanggaan_Michael[simpulAwal_Michael][simpulAkhir_Michael] = true;
	}
//	TelusuriDFS
	public List<Integer> telusuriDFS_Michael(int simpulAwal_Michael){
		validasiSimpul_Michael(simpulAwal_Michael);
		
		boolean[] sudahDikunjungi_Michael = new boolean[jumlahSimpul_Michael];
		Stack<Integer> tumpukanSimpul_Michael = new Stack<>();
		List<Integer> urutanKunjungan_Michael = new ArrayList<>();
		
		tumpukanSimpul_Michael.push(simpulAwal_Michael);
		
		while(!tumpukanSimpul_Michael.empty()) {
			int simpulSekarang_Michael = tumpukanSimpul_Michael.pop();
			
			if(!sudahDikunjungi_Michael[simpulSekarang_Michael]) {
				sudahDikunjungi_Michael[simpulAwal_Michael] = true;
				urutanKunjungan_Michael.add(simpulSekarang_Michael);
				
				for(int simpulTetangga_Michael = jumlahSimpul_Michael - 1; simpulTetangga_Michael >= 0; simpulTetangga_Michael--) {
					if(matrixKetetanggaan_Michael[simpulSekarang_Michael][simpulTetangga_Michael] && !sudahDikunjungi_Michael[simpulTetangga_Michael]) {
						tumpukanSimpul_Michael.push(simpulTetangga_Michael);
					}
				}
			}
		}
		return urutanKunjungan_Michael;
	}
//	telusuriSemuaDFS
	public List<Integer> telusuriSemuaDFS_Michael(){
		boolean[] sudahDikunjungi_Michael = new boolean[jumlahSimpul_Michael]; // Fixed typo: sudahDikunjugi
		List<Integer> urutanKunjungan_Michael = new ArrayList<>();
		
		for(int indexSimpul_Michael = 0; indexSimpul_Michael < jumlahSimpul_Michael; indexSimpul_Michael++) {
			if(!sudahDikunjungi_Michael[indexSimpul_Michael]) {				
				Stack<Integer> tumpukanSimpul_Michael = new Stack<>();
				tumpukanSimpul_Michael.push(indexSimpul_Michael);
				
				while(!tumpukanSimpul_Michael.empty()) {
					int simpulSekarang_Michael = tumpukanSimpul_Michael.pop();
					
					if(!sudahDikunjungi_Michael[simpulSekarang_Michael]) {
						sudahDikunjungi_Michael[simpulSekarang_Michael] = true;
						urutanKunjungan_Michael.add(simpulSekarang_Michael);
						
						for(int simpulTetangga_Michael = jumlahSimpul_Michael - 1; simpulTetangga_Michael >= 0; simpulTetangga_Michael--) {
							if(matrixKetetanggaan_Michael[simpulSekarang_Michael][simpulTetangga_Michael] && !sudahDikunjungi_Michael[simpulTetangga_Michael]) {
								tumpukanSimpul_Michael.push(simpulTetangga_Michael);
							}
						}
					}
				}
			}
		}
		return urutanKunjungan_Michael;
	}
//	cetakMatrix
	public void cetakMatrix_Michael() {
		System.out.println("Matrix Ketetanggaan");
		// HEADER KOLOM
		System.out.print("   ");
		for(int kolom_Michael = 0; kolom_Michael <= jumlahSimpul_Michael; kolom_Michael++) { 
			System.out.printf(" %d ", kolom_Michael);
		}
		System.out.println();
		
		// GARIS PEMISAH
		System.out.print("   ");
		for(int kolom_Michael = 0; kolom_Michael < jumlahSimpul_Michael; kolom_Michael++) { 
			System.out.print("---");
		}
		System.out.println();
		
		// ISI MATRIKS
		for(int baris_Michael = 0; baris_Michael < jumlahSimpul_Michael; baris_Michael++) { 
			System.out.printf("%2d |", baris_Michael); 
			for(int kolom_Michael = 0; kolom_Michael < jumlahSimpul_Michael; kolom_Michael++) {
				System.out.print(" " + (matrixKetetanggaan_Michael[baris_Michael][kolom_Michael] ? 1 : 0) + " "); // Fixed: println -> print
			}
			System.out.println();
		}
	}
}

public class DFS_Matrix_Michael {

	public static void main(String[] args) {
		DFS_Michael graf_Michael = new DFS_Michael(3);
		
//		MASUKIN SISI
		graf_Michael.tambahSisi_Michael(1,0);
		graf_Michael.tambahSisi_Michael(1,2);
		graf_Michael.tambahSisi_Michael(2, 1);
		
		graf_Michael.cetakMatrix_Michael();
		
		System.out.println("DFS mulai dari simpul 0" + graf_Michael.telusuriDFS_Michael(0));
		System.out.println("DFS mulai dari simpul 0" + graf_Michael.telusuriSemuaDFS_Michael());
	}
}
