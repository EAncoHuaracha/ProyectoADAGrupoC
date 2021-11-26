package Examen2;

public class codigo {
	static int[][] cost = new int[50+1][51+1];

	public static int knapsack(int n, int W, int wm[], int vm[]) {
		for(int w=0; w<=W; w++) {
			cost[0][w] = 0;
		}

		for(int i=0; i<=n; i++) {
			cost[i][0] = 0;
		}

		for(int i=1; i<=n; i++) {
			for(int w=1; w<=W; w++) {
				if(wm[i] > w) {
					cost[i][w] = cost[i-1][w];
				}
				else {
					if (vm[i]+cost[i-1][w-wm[i]] > cost[i-1][w]) {
						cost[i][w] = vm[i] + cost[i-1][w-wm[i]];
					}
					else {
						cost[i][w] = cost[i-1][w];
					}
				}
			}
		}
		return cost[n][W];
	}

	public static void main(String[] args) {
		int wm[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int vm[] = {2, 4, 6, 5, 2, 4, 1, 6, 2, 1, 2, 10, 5, 1, 3, 2, 3, 1, 1, 3, 2, 4, 2, 1, 2, 2, 1, 1, 2, 3, 1, 2, 2};
		System.out.println(knapsack(4, 5, wm, vm));
	}

}
