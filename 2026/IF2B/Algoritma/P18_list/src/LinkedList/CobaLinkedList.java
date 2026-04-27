package LinkedList;

import java.util.LinkedList;

public class CobaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> prodi = new LinkedList<String>();
		
		prodi.add("informatika");
		System.out.println("Prodi: " + prodi);
		
		prodi.add("sistem informasi");
		System.out.println("Prodi: " + prodi);
		
		prodi.add("Teknik Elektro");
		System.out.println("Prodi: " + prodi);
		
		prodi.add("Akuntansi");
		System.out.println("Prodi: " + prodi);
		
		System.out.println("prodi ke-2: " + prodi.get(1));
		
		//hapus data prodi yang berawalan huruf I
		prodi.removeIf(p -> p.startsWith("I"));
		System.out.println("Hapus Prodi Berawalan huruf I: " + prodi); //SI AK TE
		
		prodi.removeFirst(); //AK TE
		System.out.println("Prodi: " + prodi);
		
		prodi.removeLast(); //AK
		System.out.println("Prodi: " + prodi);
		
		prodi.remove(0);//NULL
		System.out.println("Prodi: " + prodi);
		
	}

}
