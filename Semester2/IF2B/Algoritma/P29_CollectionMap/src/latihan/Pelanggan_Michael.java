package latihan;

import java.util.ArrayList;

public class Pelanggan_Michael {

	private String nama_Michael;

	private ArrayList<String> pesanan_Michael=new ArrayList<>();

	public Pelanggan_Michael(String nama_Michael){
		this.nama_Michael=nama_Michael;
	}

	public String getNama_Michael(){
		return nama_Michael;
	}

	public void setNama_Michael(String nama_Michael){
		this.nama_Michael=nama_Michael;
	}

	public ArrayList<String> getPesanan_Michael(){
		return pesanan_Michael;
	}

	public void tambahPesanan_Michael(String kodeMenu_Michael){
		pesanan_Michael.add(kodeMenu_Michael);
	}

	@Override
	public String toString(){
		return nama_Michael;
	}

}