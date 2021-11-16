package Proyecto2_RecorridoGrafos;

import java.util.LinkedList;
import java.util.Queue;

public class BreadFirstSearch {
	
	public void BFS(int[][] img) {
		
		boolean[] visited = new boolean[img.length];
		for(int i = 0; i < img.length; i++) {
			if(!visited[i]) {
				Queue<Integer> tmp = new LinkedList<>();
				tmp.offer(i);
				visited[i] = true;
				while(!tmp.isEmpty()) {
					int curr = tmp.poll();
					
					for(int next : img[curr]) {
						if(!visited[next]) {
							visited[next] = true;
							tmp.offer(next);
						}
					}
				}
			}
		}
	}
}
