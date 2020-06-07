/* *****************************************************************************
 *  Name:              Geotransformer
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MyQuickUnionUF implements UF {

    private int[] parent;  // parent[i] = parent of i
    private int count;     // number of components, i.e., set of connected elements

    public MyQuickUnionUF() {
        parent = new int[] {0, 1, 9, 4, 9, 6, 6, 7, 8, 9};
        count = 6;
    }

    public MyQuickUnionUF(int n) {
        parent = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        parent[i] = j;
        count--;
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    // Returns the root of the element p
    public int find(int p) {
        while (p != parent[p]){
            p = parent[p];
        }
        return p;
    }

    // Returns the root of the element
    public int root(int i) {
        while (i != parent[i]){
            i = parent[i];
        }
        return i;
    }

    public int count() {
        return count;
    }

    public static void main(String[] args) {
        StdOut.println("Please enter elements");


        MyQuickUnionUF uf = new MyQuickUnionUF();

        uf.union(0,1);

        StdOut.println(uf.count() + " components");

    }
}
