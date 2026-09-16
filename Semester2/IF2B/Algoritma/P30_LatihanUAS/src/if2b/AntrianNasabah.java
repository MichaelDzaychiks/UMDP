package if2b;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AntrianNasabah {
//	Queue
	Queue<Nasabah> queueCS = new LinkedList<Nasabah>();
	Queue<Nasabah> queueTeller = new LinkedList<Nasabah>();
	
//	Map <Nomor Antrian, Nasabah>
//	menyimpan data antrian nasabah
	Map<String, Nasabah> dataNasabah = new HashMap<String, Nasabah>();
	
//	nomor urut antrian
	int antrianCS = 1;
	int antrianTeller = 1;
	
	public void ambilAntrian(String nama, String noRekening, String jenisLayanan) {
		if(jenisLayanan.equalsIgnoreCase("CS")) {
			String nomorAntrian = String.format("CS%03d", antrianCS++);
			
			Nasabah nasabah = new Nasabah(nomorAntrian, nama, noRekening, "Costumer Service");
			
//			masukkan ke Queue
			queueCS.add(nasabah);
			
//			masukkan ke map
			dataNasabah.put(nomorAntrian, nasabah);
			
			System.out.println(nama + " ambil antrian CS");
			System.out.println("Nomor Antrian Anda: " + nomorAntrian);
			System.out.println();
			
		} else if (jenisLayanan.equalsIgnoreCase("Teller")) {
			String nomorAntrian = String.format("TL%03d", antrianTeller++);
			
			Nasabah nasabah = new Nasabah(nomorAntrian, nama, noRekening, jenisLayanan);
			
//			masukkan ke Queue
			queueTeller.add(nasabah);
			
//			masukkan ke map
			dataNasabah.put(nomorAntrian, nasabah);
			
			System.out.println(nama + " ambil antrian CS" + jenisLayanan);
			System.out.println("Nomor Antrian Anda: " + nomorAntrian);
		} else {
			System.out.println("Layanan Tidak Tersedia");
		}
	}
	
	public void lihatAntrianCS() {
		if(queueCS.isEmpty()) {
			System.out.println("Tidak ada Antrian");
			return;
		} 
		for(Nasabah antrianCS : queueCS) {
			System.out.println(antrianCS.getNomorAntrian() + " - " + antrianCS.getNama());
		}
	}
	
	public void lihatAntrianTeller() {
		if(queueTeller.isEmpty()) {
			System.out.println("Tidak ada Antrian");
			return;
		} 
		for(Nasabah antrianTeller : queueCS) {
			System.out.println(antrianTeller.getNomorAntrian() + " - " + antrianTeller.getNama());
		}
	}
	
	public void lihatAntrian() {
		System.out.println("Costumer Service : ");
		lihatAntrianCS();
		
		System.out.println("\nTeller : ");
		lihatAntrianTeller();
	}
	
	public void panggilAntrianCS() {
		if(queueCS.isEmpty()) {
			System.out.println("Tidak ada antrian CS");
			return;	
		}
		Nasabah nasabah = queueCS.poll();
		dataNasabah.remove(nasabah.getNomorAntrian());
		
		System.out.println("Memanggil Antrian " + nasabah.getNomorAntrian());
		System.out.println("Nama : " + nasabah.getNama());
		
		System.out.println("\nSisa Antrian: ");
		lihatAntrianCS();
	}
		
	public static void main(String[] args) {
		AntrianNasabah antrian = new AntrianNasabah();
		
//		ambil antrian
		antrian.ambilAntrian("Budi", "1234", "CS");
		antrian.ambilAntrian("Budi", "1234", "Teller");
		antrian.ambilAntrian("Citra", "2121", "CS");
		
		antrian.lihatAntrian();
		antrian.panggilAntrianCS();
//		antrian.panggilAntrianTeller();
	}
}
