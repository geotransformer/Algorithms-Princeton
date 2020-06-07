/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MyWeightedQuickUnionUF {

    private int[] parent;   // parent[i] = parent of i
    private int[] size;     // size[i] = number of elements in subtree rooted at i
    private int count;      // number of components

    public MyWeightedQuickUnionUF(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    /**
     * Returns the number of sets.
     *
     * @return the number of sets [1, n]]
     */
    public int count() {
        return count;
    }

    /**
     * Merges the set containing element p with the
     * the set containing element q.
     */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }

    /**
     * Returns the canonical/root element of the set containing element p.
     */
    public int find(int p) {
        while (p != parent[p]){
            //compressed - path compression
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    /**
     * Returns true if the two elements are in the same set.
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public static void main(String[] args) {

    }
}
