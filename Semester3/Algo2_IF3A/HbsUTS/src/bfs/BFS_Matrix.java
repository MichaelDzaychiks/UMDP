package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graf{
	private int V; // vertek atau simpul / node
	private boolean [][] adj; // matriks ketetanggan
	
	public Graf (int vertex) {
		V = vertex;
		adj = new boolean [vertex][vertex]; // size matriks ketetanggan
	}
	public void cekVertex (int x) {
		if (x < 0 || x >= V) {
			throw new IllegalArgumentException("Vertex diluar range");
		}
	}
	public void tambahSisi(int u, int v) {
		cekVertex(u);
		cekVertex(v);
		adj[u][v] = true;
	}
	
	public List<Integer> bfs (int simpul_awal){
		cekVertex(simpul_awal);
		boolean[] visited = new boolean [V];
		LinkedList<Integer> queue = new LinkedList<>();
		List<Integer> output = new ArrayList<>();
		visited[simpul_awal] = true ;
		queue.add(simpul_awal);
		while(!queue.isEmpty()) {
			int u = queue.poll();
			output.add(u);
			//tetangga u: semua v dengan adj[u][v] = true
			for(int v = 0; v < V; v++) {
				if(adj[u][v] && !visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}
		return output;
	}
	
	public void tampilHeaderMatrix() {
		System.out.print("  ");
		for(int i = 0; i < V; i++) {
			System.out.printf(" "
					+ "%2d", i);
		}
		System.out.println();
		System.out.print("  "); //4x spasi
		for(int i = 0; i<V; i++) {
			System.out.print("---");
		}
		System.out.println();
	}
	
	public void tampilMatrix() {
		System.out.println("---Matrix ketetanggaan---");
		tampilHeaderMatrix(); //garis atas (table)
		for(int i = 0; i < V; i++) { //baris
			System.out.printf("%2d |",i);//garis kolom (table)
			for(int j = 0; j < V;j++) { //kolom
				System.out.print((adj[i][j] ? 1 : 0) + "  "); //ubah true = 1 dan false = 0
			}
			System.out.println();
		}
	}
}

public class BFS_Matrix {
	public static void main(String[] args) {
		Graf g = new Graf(6);
		g.tambahSisi(0, 1);
		g.tambahSisi(0, 4);
		g.tambahSisi(1, 2);
		g.tambahSisi(2, 3);
		g.tambahSisi(4, 2);
		g.tambahSisi(4, 5);
		g.tambahSisi(5, 3);
		g.tampilMatrix();
		List<Integer> output_bfs = g.bfs(0);
		System.out.println("BFS = " + output_bfs);
	}
}