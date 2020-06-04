/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.util.PriorityQueue;

public class Minesweeper {
    public static void main(String[] args) {
        // input
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] grid = new char[m][n];

        // initialize the bomb
        while (k != 0) {
            int a = (int) (Math.random() * m);
            int b = (int) (Math.random() * n);
            if (grid[a][b] == 0) {
                grid[a][b] = '*';
                k -= 1;
            }
        }

        // Count the bomb
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '*') {
                    int count = 0;
                    if ((j - 1) != -1) {
                        if (grid[i][j - 1] == '*') {
                            count += 1;
                        }
                    }
                    if ((i - 1) != -1) {
                        if (grid[i - 1][j] == '*') {
                            count += 1;
                        }
                    }
                    if ((i - 1) != -1 && (j - 1) != -1) {
                        if (grid[i - 1][j - 1] == '*') {
                            count += 1;
                        }
                    }
                    if ((i - 1) != -1 && (j + 1) != n) {
                        if (grid[i - 1][j + 1] == '*') {
                            count += 1;
                        }
                    }
                    if ((i + 1) != m) {
                        if (grid[i + 1][j] == '*') {
                            count += 1;
                        }
                    }
                    if ((j + 1) != n) {
                        if (grid[i][j + 1] == '*') {
                            count += 1;
                        }
                    }
                    if ((i + 1) != m && (j + 1) != n) {
                        if (grid[i + 1][j + 1] == '*') {
                            count += 1;
                        }
                    }
                    if ((i + 1) != m && (j - 1) != -1) {
                        if (grid[i + 1][j - 1] == '*') {
                            count += 1;
                        }
                    }

                    // int to char before assignment
                    grid[i][j] = (char) (48 + count);
                }
            }
        }

        // Print the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }

        // Min heap
        PriorityQueue<String> pq = new PriorityQueue<>();


    }
}
