package if2b;

import java.util.PriorityQueue;

public class ContohPriorityQueue {

	public static void main(String[] args) {
		//note: PriorityQueue default : ascending (kecil ke besar)
		
		PriorityQueue<Integer> nilai = new PriorityQueue<>();
		nilai.add(100);
		nilai.add(50);
		nilai.add(90);
		nilai.add(40);
		nilai.add(80);
		
		//Queue = 100 50 90 40 80 -> sesuai urutan input
		//PriorityQueue = 40 50 80 90 100 -> diurutkan berdasarkan pembanding
		System.out.println("Data Nilai= ");
		while(!nilai.isEmpty()) {
			System.out.print(nilai.remove() + " ");
		}
	}

}
