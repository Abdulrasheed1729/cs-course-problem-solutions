public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int count = 1;
        double fraction = 0.0;
        double[] numOfPeople = new double[n + 2];

        while (count <= n && fraction < 0.5) {
            for (int i = 0; i < trials; i++) {
                int found = 0;
                boolean[] hasBirthday = new boolean[n];
                int peopleEntered = 1;

                while (peopleEntered < count + 1) {
                    int birthDay = (int) (Math.random() * n);
                    peopleEntered++;

                    if (!hasBirthday[birthDay]) hasBirthday[birthDay] = true;
                    else found++;
                }
                numOfPeople[count] += found;
            }
            fraction = numOfPeople[count] / trials;
            System.out.println(count + "\t" + (int) (numOfPeople[count] - numOfPeople[count - 1]) + "\t" + fraction);
            count++;
        }
    }
}
