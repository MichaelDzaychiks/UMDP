package if2b;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<Integer> dataAntrian = new LinkedList<>();
		
		dataAntrian.add(1); // 1
		dataAntrian.add(3); // 1 3
		dataAntrian.add(5); // 1 3 5
		dataAntrian.add(2); // 1 3 5 2
		dataAntrian.add(4); // 1 3 5 2 4
		
		System.out.println("Nomor Antrian saat ini = " + dataAntrian);
		
		System.out.println("Panggil antrian no." + dataAntrian.peek()); // peek = mengetahui elemen paling awalnya apa
		dataAntrian.remove(); //hapus elemen awal
		
		System.out.println("Nomor antrian saat ini = " + dataAntrian); // 3 5 2 4
		
		//shortcut
		System.out.println("Panggil antrian no." + dataAntrian.remove());
		//poll() dan remove() adalah sama digunakan untuk menghapus elemen
		//bedanya poll akan memberi nilau null jika queue kosong (remove() akan error jika queue kosong)
		System.out.println("Panggil antrian no." + dataAntrian.poll());
		System.out.println("Panggil antrian no." + dataAntrian.poll());
		System.out.println("Panggil antrian no." + dataAntrian.poll());
		System.out.println("Panggil antrian no." + dataAntrian.poll());
	}

}
