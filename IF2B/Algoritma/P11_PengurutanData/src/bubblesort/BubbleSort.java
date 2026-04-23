package bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort_Ascending(int[] data, int n) {
		for(int i = 0; i < n; i++) { //jumlah iterasi = n -1
			for(int j = 0; j < n-i-1; j++) { //data yang dibandingkan 
				if(data[j] > data[j+1]) { //pertukaran elemen1 > elemen 2 TUKAR) 
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort_Descending(int[] data, int n) {
		for(int i = 0; i < n; i++) { 
			for(int j = 0; j < n-i-1; j++) {  
				if(data[j] < data[j+1]) { 
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] data = {-2,45,0,11,-9};
		
		System.out.println("Data Awal: " + Arrays.toString(data));
		
		bubbleSort_Ascending(data,data.length);
		System.out.println("Data Setelah Pengurutan (Ascending) : " + Arrays.toString(data));
		
		bubbleSort_Descending(data,data.length);
		System.out.println("Data setelah Pengurutan (Descending): " + Arrays.toString(data));
	}
}
