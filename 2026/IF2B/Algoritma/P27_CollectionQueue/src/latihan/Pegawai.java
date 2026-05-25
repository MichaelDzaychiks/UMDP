package latihan;

public class Pegawai implements Comparable<Pegawai>{

	private String nip;
	private String nama;
	private int gaji;
	
	public Pegawai(String nip, String nama, int gaji) {
		this.nip = nip;
		this.nama = nama;
		this.gaji = gaji; 
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}

	@Override
	public int compareTo(Pegawai o) {
		//diurutkan berdasarkan gaji berdasarkan descending
//		return Integer.compare(o.getGaji(), this.getGaji());
		//asc = this.getGaji(),o.getGaji()
		//desc = o.getGaji(), this.getGaji()
		
		//diurutkan berdasarkan Nama secara desc
		return o.getNama().compareTo(this.getNama());
		//asc = this.getNama(),o.getNama()
		//desc = o.getNama(), this.getNama()
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nip = " + nip + "- Nama = " + nama + "- Gaji = " + gaji;
	}
	
	
	
}
