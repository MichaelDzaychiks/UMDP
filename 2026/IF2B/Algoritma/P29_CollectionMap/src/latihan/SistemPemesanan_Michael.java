package latihan;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SistemPemesanan_Michael {

	public static void main(String[] args) {

		HashMap<String,Menu_Michael> daftarMenu_Michael=new HashMap<>();

		daftarMenu_Michael.put("M01",new Menu_Michael("M01","Nasi Goreng"));
		daftarMenu_Michael.put("M02",new Menu_Michael("M02","Mie Ayam"));
		daftarMenu_Michael.put("M03",new Menu_Michael("M03","Bakso"));
		daftarMenu_Michael.put("M04",new Menu_Michael("M04","Sate Ayam"));
		daftarMenu_Michael.put("M05",new Menu_Michael("M05","Ayam Geprek"));

		System.out.println("=== DAFTAR MENU ===");

		for(Menu_Michael menu_Michael : daftarMenu_Michael.values()){
			System.out.println(menu_Michael);
		}

		Queue<Pelanggan_Michael> antrian_Michael=new LinkedList<>();

		Pelanggan_Michael andi_Michael=new Pelanggan_Michael("Andi");
		andi_Michael.tambahPesanan_Michael("M01");
		andi_Michael.tambahPesanan_Michael("M03");

		Pelanggan_Michael budi_Michael=new Pelanggan_Michael("Budi");
		budi_Michael.tambahPesanan_Michael("M02");

		Pelanggan_Michael citra_Michael=new Pelanggan_Michael("Citra");
		citra_Michael.tambahPesanan_Michael("M04");
		citra_Michael.tambahPesanan_Michael("M05");

		Pelanggan_Michael dinda_Michael=new Pelanggan_Michael("Dinda");
		dinda_Michael.tambahPesanan_Michael("M01");
		dinda_Michael.tambahPesanan_Michael("M02");
		dinda_Michael.tambahPesanan_Michael("M05");

		Pelanggan_Michael eko_Michael=new Pelanggan_Michael("Eko");
		eko_Michael.tambahPesanan_Michael("M03");

		antrian_Michael.add(andi_Michael);
		antrian_Michael.add(budi_Michael);
		antrian_Michael.add(citra_Michael);
		antrian_Michael.add(dinda_Michael);
		antrian_Michael.add(eko_Michael);

		LinkedList<String> dapur_Michael=new LinkedList<>();

		System.out.println();
		System.out.println("=== MENU YANG AKAN DIMASAK ===");

		while(!antrian_Michael.isEmpty()){

			Pelanggan_Michael pelanggan_Michael=antrian_Michael.poll();

			for(String kodeMenu_Michael : pelanggan_Michael.getPesanan_Michael()){

				Menu_Michael menu_Michael = daftarMenu_Michael.get(kodeMenu_Michael);

				String pesanan_Michael = pelanggan_Michael.getNama_Michael() +" -> "+ menu_Michael.getNamaMenu_Michael();

				dapur_Michael.add(pesanan_Michael);

				System.out.println(pesanan_Michael);
			}
		}

		Stack<String> riwayat_Michael=new Stack<>();

		System.out.println();
		System.out.println("=== PROSES DAPUR ===");

		while(!dapur_Michael.isEmpty()){

			String pesanan_Michael=dapur_Michael.removeFirst();

			System.out.println();
			System.out.println("Sedang dimasak : "+pesanan_Michael);

			riwayat_Michael.push(pesanan_Michael);

			System.out.println("Selesai        : "+pesanan_Michael);
		}

		System.out.println();
		System.out.println("=== RIWAYAT PESANAN ===");

		while(!riwayat_Michael.isEmpty()){
			System.out.println(riwayat_Michael.pop());
		}

	}

}