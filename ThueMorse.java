/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        // input
        int m = Integer.parseInt(args[0]);

        // how many iteration in need
        int n = 0;
        while (Math.pow(2, n) < m) {
            n++;
        }

        // initialize the array
        boolean[] seq = new boolean[m];
        seq[0] = false;

        // iterate
        for (int i = 1; i <= n; i++) {
            int start = (int) Math.pow(2, i - 1);
            for (int j = 0; j < start && (j + start) < m; j++) {
                seq[j + start] = !seq[j];
            }
        }

        // print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (seq[j] == seq[i]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
