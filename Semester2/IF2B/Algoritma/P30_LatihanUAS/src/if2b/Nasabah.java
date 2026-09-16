package if2b;

public class Nasabah {

	private String nomorAntrian;
	private String nama;
	private String noRekening;
	private String jenisLayanan;
	
	public Nasabah() {
		// TODO Auto-generated constructor stub
	}

	public Nasabah(String nomorAntrian, String nama, String noRekening, String jenisLayanan) {
		this.nomorAntrian = nomorAntrian;
		this.nama = nama;
		this.noRekening = noRekening;
		this.jenisLayanan = jenisLayanan;
	}

	public String getNomorAntrian() {
		return nomorAntrian;
	}

	public void setNomorAntrian(String nomorAntrian) {
		this.nomorAntrian = nomorAntrian;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoRekening() {
		return noRekening;
	}

	public void setNoRekening(String noRekening) {
		this.noRekening = noRekening;
	}

	public String getJenisLayanan() {
		return jenisLayanan;
	}

	public void setJenisLayanan(String jenisLayanan) {
		this.jenisLayanan = jenisLayanan;
	}
	
	
	
}
