/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 ******************************************************************************/

public class DiscreteDistribution {
    public static void main(String[] args) {
        // input
        int m = Integer.parseInt(args[0]);
        int count = args.length - 1;
        double[] numbers = new double[count];
        double sum = 0;

        // Arguments to double array and calculate the sum
        for (int i = 0; i < count; i++) {
            numbers[i] = Double.parseDouble(args[i + 1]);
            sum += numbers[i];
        }

        // Probability cumulation
        double[] cumulation = new double[count];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                cumulation[i] = (100 * numbers[i]) / sum;
            }
            else {
                cumulation[i] = cumulation[i - 1] + (100 * numbers[i]) / sum;
            }
        }

        // Trial the random and  print the index result
        for (int i = 0; i < m; i++) {
            double p = Math.random() * 100;
            int j = count;
            while (j >= 1 && p < cumulation[j - 1]) {
                j--;
            }
            if (i >= 25 && (i % 25 == 0)) {
                System.out.println();
            }
            System.out.print(j + 1 + " ");
        }
        System.out.println();
    }

}
