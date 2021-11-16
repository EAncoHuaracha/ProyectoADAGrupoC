package Proyecto2_RecorridoGrafos;

import java.util.Stack;

public class DepthFirstSearch {
	
	public void DFS(int[][] array,int i,int j,int num) {
		
		int base = array[i][j];
		int limH = array.length;
		int limV = array[0].length;

		boolean[][] visited = new boolean[limH][limV];

		Stack<String> stack = new Stack<>();

		stack.push(i + "," + j);

		while (stack.empty() == false) {
			
			String tmp = stack.pop();
			int fila = Integer.parseInt(tmp.split(",")[0]);
			int columna = Integer.parseInt(tmp.split(",")[1]);

			if(fila<0 || columna<0 || fila>=limH || columna>=limV || visited[fila][columna] || array[fila][columna] > (num+base) || array[fila][columna] < (base-num))
				continue;

			visited[fila][columna]=true;
			array[fila][columna]=1;
			
			stack.push(fila + "," + (columna-1));
			stack.push(fila + "," + (columna+1)); 
			stack.push((fila-1) + "," + columna); 
			stack.push((fila+1) + "," + columna); 
		}
	}
}
