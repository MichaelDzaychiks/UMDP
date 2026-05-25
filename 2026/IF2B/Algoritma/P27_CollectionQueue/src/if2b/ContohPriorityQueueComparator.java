package if2b;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ContohPriorityQueueComparator {

	public static void main(String[] args) {
		
		Comparator<Integer> pembanding = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1; // asc: o1-o2, desc:o2-o1
			}
			
		};
		
		PriorityQueue<Integer> nilai = new PriorityQueue<>(pembanding);
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
