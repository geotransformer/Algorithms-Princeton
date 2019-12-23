/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 ******************************************************************************/
public class Birthday {
    public static void main(String[] args) {
        // input
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int cntTrial = 0;
        int personInTheRoom = 0;
        int acc = 0;
        double accProb = 0;

        int[] birthdays = new int[n];


        do {
            birthdays[personInTheRoom] = (int) (Math.random() * n);
            for (int i = 0; i < trials; i++) {
                int newBirthday = (int) (Math.random() * n);
                for (int k = 0; k < personInTheRoom; k++) {
                    if (newBirthday == birthdays[k]) {
                        cntTrial = cntTrial + 1;
                        break;
                    }
                }
            }
            personInTheRoom = personInTheRoom + 1;
            acc = acc + cntTrial;
            accProb = acc * 1.0 / trials;
            System.out.println(personInTheRoom + "\t" + cntTrial + "\t" + accProb);
            cntTrial = 0;
        } while (accProb < 0.50 && personInTheRoom <n);
    }
}
