package insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort_Ascending(int[] data,int n) {
		int temp,j;
		for(int i = 1; i < n; i++) { //jumlah iterasi
			temp = data[i];
			j = i-1; //kolom
			
			while(j >= 0 && data[j] > temp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = temp;
		}
	}
	
	public static void insertionSort_Descending(int[] data, int n) {
		int temp,j;
		for(int i = 1; i < n; i++) { 
			temp = data[i];
			j = i-1; 
			
			while(j >= 0 && data[j] < temp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] data = {26 ,54 ,93 ,17 ,77 ,31 ,44 ,55 ,20};
		
		System.out.println("Data Awal: " + Arrays.toString(data));
		
		insertionSort_Ascending(data,data.length);
		System.out.println("Data Setelah Pengurutan (Ascending) : " + Arrays.toString(data));
		
		insertionSort_Descending(data,data.length);
		System.out.println("Data setelah Pengurutan (Descending): " + Arrays.toString(data));
	}

}
