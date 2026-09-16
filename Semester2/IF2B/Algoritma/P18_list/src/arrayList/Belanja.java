package arrayList;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

class Barang{
	String nama;
	int harga, jumlah;
	
//	ini constructor
	public Barang(String nama,int harga,int jumlah) {
		this.nama = nama;
		this.harga = harga;
		this.jumlah = jumlah;
	}
	
	public int getSubTotal() {
		return harga*jumlah;
	}
}

public class Belanja {

	public static void main(String[] args) {
		
		int total = 0;
		
		ArrayList<Barang> dataBarang = new ArrayList<Barang>();
		dataBarang.add(new Barang("Beras", 12000, 2));
		dataBarang.add(new Barang("Mie", 3500, 1));
		dataBarang.add(new Barang("Telur", 2500, 2));
		
		System.out.println("Detail Barang: ");
		System.out.println("Nama Barang \tHarga \tJumlah \tSubtotal");
		for(Barang data : dataBarang) {
			System.out.println(data.nama + "\t\t" + 
								data.harga + "\t" +
								data.jumlah + "\t" + 
								data.getSubTotal());
			total = total + data.getSubTotal();
		}
		System.out.println("total bayar = Rp." + total);
	}

}
