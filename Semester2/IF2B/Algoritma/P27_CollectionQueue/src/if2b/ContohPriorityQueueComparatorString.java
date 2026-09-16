package if2b;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ContohPriorityQueueComparatorString {

	public static void main(String[] args) {
		
		Comparator<String> pembanding = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); //asc = o1.compareTo(o2)
										 //desc= o2.compareTo(o1)
			}
			
		};
		
		PriorityQueue<String> dataMahasiswa = new PriorityQueue<>(pembanding);
		dataMahasiswa.add("Michael");
		dataMahasiswa.add("Chan");
		dataMahasiswa.add("Kiana");
		dataMahasiswa.add("Iro-P");
		dataMahasiswa.add("Yoza");
		
		//tanpa pembanding
		//Chan Iro-P Kiana Michael Yoza
		
		//Descending
		//Yoza Michael Kiana Iro-P Chan
		
		System.out.println("Data Mahasiswa= ");
		while(!dataMahasiswa.isEmpty()) {
			System.out.print(dataMahasiswa.remove() + " ");
		}
		
	}

}
