public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int steps = 0;
        int x0 = 0;
        int y0 = 0;
        double averageSteps;

        int distance = 0;

        int totalSteps;
        totalSteps = 0;
        for (int i = 1; i < trials; i++) {
            while (distance != r) {
                double random = Math.random();
                if (random < 0.25) x0--;
                else if (random > 0.25 && random < 0.5) x0++;
                else if (random > 0.5 && random < 0.75) y0--;
                else y0++;
                distance = Math.abs(x0) + Math.abs(y0);
                steps++;
            }
            totalSteps += steps;
        }
        averageSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}
