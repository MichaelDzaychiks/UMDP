package latihan;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		Pegawai pegawai1 = new Pegawai("2529250032", "Michael Chan", 5000000);
		Pegawai pegawai2 = new Pegawai("2529250035", "Paga Mikhael", 12000000);
		Pegawai pegawai3 = new Pegawai("2529250007", "Peter King", 35000000);
		Pegawai pegawai4 = new Pegawai("2529250010", "Farel Jonathan", 90000000);
		Pegawai pegawai5 = new Pegawai("2529250034", "Tofin Anugrah", 20000000);
		
		//Masukkan ke priority Queue
		PriorityQueue<Pegawai> dataPegawai = new PriorityQueue<Pegawai>();
		dataPegawai.add(pegawai1);
		dataPegawai.add(pegawai2);
		dataPegawai.add(pegawai3);
		dataPegawai.add(pegawai4);
		dataPegawai.add(pegawai5);
		
		System.out.println("Data Pegawai= ");
		System.out.println("Nip                       - Nama   -           Gaji");
		while(!dataPegawai.isEmpty()) {
			System.out.print(dataPegawai.remove() + " ");
			System.out.println();
		}
	}

}
