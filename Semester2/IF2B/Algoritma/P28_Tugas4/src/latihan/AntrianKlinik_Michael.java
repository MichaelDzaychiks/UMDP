package latihan;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class AntrianKlinik_Michael {

	static HashSet<String> dataPasien_Michael=new HashSet<>();
	static Queue<Pasien_Michael> antrianPasien_Michael=new LinkedList<>();
	static int nomorAntrian_Michael=1;

	public static void tambahPasien_Michael(Pasien_Michael pasien){

		if(!dataPasien_Michael.contains(pasien.getKodePasien_Michael())){

			dataPasien_Michael.add(pasien.getKodePasien_Michael());
			pasien.setNomorUrut_Michael(nomorAntrian_Michael);
			antrianPasien_Michael.add(pasien);

			System.out.println(pasien.getNamaPasien_Michael()
					+" masuk antrian nomor "
					+nomorAntrian_Michael);

			nomorAntrian_Michael++;

		}else{

			System.out.println("Data pasien sudah ada");
		}
	}

	public static void panggilPasien_Michael(){

		if(!antrianPasien_Michael.isEmpty()){
			Pasien_Michael pasienPanggil=antrianPasien_Michael.poll();
			System.out.println("Memanggil pasien "+pasienPanggil.getNamaPasien_Michael() +" nomor " +pasienPanggil.getNomorUrut_Michael());
		}else{
			System.out.println("Antrian kosong");
		}
	}

	public static void cekAntrian_Michael(){

		if(!antrianPasien_Michael.isEmpty()){

			System.out.println("\nPasien berikutnya");
			System.out.println(antrianPasien_Michael.peek());

		}else{

			System.out.println("Tidak ada antrian");
		}
	}

	public static void sisaAntrian_Michael(){

		System.out.println("\nSisa antrian");

		if(antrianPasien_Michael.isEmpty()){
			System.out.println("Kosong");

		}else{
			for(Pasien_Michael pasien:antrianPasien_Michael){
				System.out.println(pasien);
			}
		}
	}

	public static void main(String[] args){

		Pasien_Michael pasien1_Michael=new Pasien_Michael("P001","Andi");
		Pasien_Michael pasien2_Michael=new Pasien_Michael("P002","Budi");
		Pasien_Michael pasien3_Michael=new Pasien_Michael("P003","Citra");
		Pasien_Michael pasien4_Michael=new Pasien_Michael("P001","Andi");
		Pasien_Michael pasien5_Michael=new Pasien_Michael("P004","Dewi");

		tambahPasien_Michael(pasien1_Michael);
		tambahPasien_Michael(pasien2_Michael);
		tambahPasien_Michael(pasien3_Michael);
		tambahPasien_Michael(pasien4_Michael);
		tambahPasien_Michael(pasien5_Michael);

		System.out.println("\nPemanggilan Pasien");
		panggilPasien_Michael();

		System.out.println("\nPemanggilan Pasien");
		panggilPasien_Michael();

		cekAntrian_Michael();

		sisaAntrian_Michael();

		Pasien_Michael pasien6_Michael=new Pasien_Michael("P005","Tina");

		tambahPasien_Michael(pasien6_Michael);

		sisaAntrian_Michael();
	}
}