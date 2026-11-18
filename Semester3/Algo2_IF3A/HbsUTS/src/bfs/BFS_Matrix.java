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
//	graf berarah
	public void tambahSisi(int u, int v) {
		cekVertex(u);
		cekVertex(v);
		adj[u][v] = true;
	}
//	graf tak berarah
	public void tambahSisi_2(int u, int v) {
		cekVertex(u);
		cekVertex(v);
		adj[u][v] = true;
		adj[v][u] = true;
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
	
//	BFS UNTUK SEMUA VERTEX
	public List<Integer> bfs_ALL (){
		boolean[] visited = new boolean [V];
		LinkedList<Integer> queue = new LinkedList<>();
		List<Integer> output = new ArrayList<>();
		
		for (int i = 0 ; i < V ; i++ ) {
			if (!visited[i]) {
				visited[i] = true;
				queue.add(i);
				while(!queue.isEmpty()) {
					int u = queue.poll();
					output.add(u);
					for (int v = 0 ; v < V ; v++) {
						if (adj[u][v] && !visited[v]) {
							visited[v] = true;
							queue.add(v);
						}
					}
				}
			}
		}
		return output;
	}
	
	public List<Integer> bfs_ALL_2 (int simpul_awal){
		cekVertex(simpul_awal);
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		List<Integer> output = new ArrayList<Integer>();
		
		for(int i = 0; i < V; i++) {
			int s = (i == 0) ? simpul_awal : (i == simpul_awal)? 0 : i;
			if(!visited[s]) {
				visited[s] = true;
				queue.add(s);
				while(!queue.isEmpty()) {
					int u = queue.poll();
					output.add(u);
					for(int v=0; v < V; v++) {
						if(adj[u][v] && visited[v]) {
							visited[v] = true;
							queue.add(v);
						}
					}
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
		
		System.out.println();
		Graf g2 = new Graf(4);
		g2.tambahSisi_2(0, 1);
		g2.tambahSisi_2(0, 2);
		g2.tambahSisi_2(1, 2);
		g2.tambahSisi_2(1, 3);
		g2.tambahSisi_2(2, 3);
		g2.tampilMatrix();
		List<Integer> output_bfs2 = g2.bfs(0);
		System.out.println("BFS = " + output_bfs2);
		
		System.out.println();
		Graf g3 = new Graf(5);
		g3.tambahSisi_2(1, 2);
		g3.tambahSisi_2(1, 3);
		g3.tambahSisi_2(2, 3);
		g3.tambahSisi_2(3, 4);
		g3.tampilMatrix();
		List<Integer> output_bfs3 = g3.bfs(1);
		System.out.println("BFS = " + output_bfs3);
	}
}