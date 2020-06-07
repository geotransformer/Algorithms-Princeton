/* *****************************************************************************
 *  Name:              Geotransformer
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 ******************************************************************************/

public interface UF {
    void union(int p, int q);
    boolean isConnected(int p, int q);
    int find(int p);
    int count();


}
