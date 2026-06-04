package latihan;

public class Menu_Michael {

	private String kode_Michael;
	private String namaMenu_Michael;

	public Menu_Michael(String kode_Michael,String namaMenu_Michael){
		this.kode_Michael=kode_Michael;
		this.namaMenu_Michael=namaMenu_Michael;
	}

	public String getKode_Michael(){
		return kode_Michael;
	}

	public void setKode_Michael(String kode_Michael){
		this.kode_Michael=kode_Michael;
	}

	public String getNamaMenu_Michael(){
		return namaMenu_Michael;
	}

	public void setNamaMenu_Michael(String namaMenu_Michael){
		this.namaMenu_Michael=namaMenu_Michael;
	}

	@Override
	public String toString(){
		return kode_Michael+" - "+namaMenu_Michael;
	}

}