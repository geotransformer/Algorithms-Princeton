/* *****************************************************************************
 *  Name:              Geotransformer
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */


public class MyQuickFindUF implements UF {

    private int[] ids;

    public MyQuickFindUF(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public void union(int p, int q) {
        int pid = ids[p];
        int qid = ids[q];
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == pid){
                ids[i] = qid;
            }
        }

    }

    public boolean isConnected(int p, int q) {
        return ids[p] == ids[q];
    }

    public int find(int p) {
        return ids[p];
    }

    public int count() {
        return 0;
    }

    public static void main(String[] args) {

    }
}
