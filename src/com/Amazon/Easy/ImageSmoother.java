package com.Amazon.Easy;

/**
 * 
 * 
 * @author harsh.dusane
 *
 *         Intuition and Algorithm
 * 
 *         For each cell in the grid, look at the immediate neighbors - up to 9
 *         of them, including the original cell.
 * 
 *         Then, we will add the sum of the neighbors into ans[r][c] while
 *         recording count, the number of such neighbors. The final answer is
 *         the sum divided by the count.
 * 
 * 
 */
public class ImageSmoother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[][] imageSmoother(int[][] M) {
		int R = M.length, C = M[0].length;
		int[][] ans = new int[R][C];

		for (int r = 0; r < R; ++r)
			for (int c = 0; c < C; ++c) {
				int count = 0;
				for (int nr = r - 1; nr <= r + 1; ++nr)
					for (int nc = c - 1; nc <= c + 1; ++nc) {
						if (0 <= nr && nr < R && 0 <= nc && nc < C) {
							ans[r][c] += M[nr][nc];
							count++;
						}
					}
				ans[r][c] /= count;
			}
		return ans;
	}

}
