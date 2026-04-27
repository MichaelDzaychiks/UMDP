package LinkedList;

import java.util.LinkedList;

class Pasien{
	String nama, keluhan;
	int usia;
	
	public Pasien(String nama, int usia, String keluhan) {
		this.nama = nama;
		this.usia = usia;
		this.keluhan = keluhan;
	}
}

public class Antrian {

	public static void cetakAntrian(LinkedList<Pasien> pasien) {
		for(Pasien dataPasien : pasien) {
			System.out.println(dataPasien.nama + "-" +
							   dataPasien.usia + "-" +
							   dataPasien.keluhan);
		}
		System.out.println("===========================================================");
	}
	
	public static void panggilAntrian(LinkedList<Pasien> pasien) {
		pasien.removeFirst();
	}
	
	public static void main(String[] args) {
		LinkedList<Pasien> pasien = new LinkedList<Pasien>();
		pasien.add(new Pasien("Kiana",18,"Sakit gigi"));
		pasien.add(new Pasien("Michael",17,"Sakit hati"));
		pasien.add(new Pasien("IroP",19,"Diare"));
		pasien.add(new Pasien("Kaguya",16,"Vertigo"));
		
		cetakAntrian(pasien);
		panggilAntrian(pasien); //kiana
		
		cetakAntrian(pasien);
		panggilAntrian(pasien); //Michael

		//pasien gawat darurat
		pasien.addFirst(new Pasien("Iroha", 15, "sakit palak"));
		cetakAntrian(pasien);
		
		//pasien Kaguya batal Periksa
		pasien.removeIf(p -> p.nama.startsWith("Kaguya"));
		cetakAntrian(pasien);
		
		//hapus semua data antrian
		pasien.removeAll(pasien);
		cetakAntrian(pasien);

	}

}
