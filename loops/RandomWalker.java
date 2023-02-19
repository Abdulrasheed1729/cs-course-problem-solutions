public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x0 = 0;
        int y0 = 0;

        int distance = 0;
        System.out.println("(" + x0 + ", " + y0 + ")");
        while (distance != r) {
            double random = Math.random();
            if (random < 0.25) x0--;
            else if (random > 0.25 && random < 0.5) x0++;
            else if (random > 0.5 && random < 0.75) y0--;
            else y0++;
            distance = Math.abs(x0) + Math.abs(y0);
            steps++;
            System.out.println("(" + x0 + ", " + y0 + ")");
        }
        System.out.println("steps = " + steps);

    }
}
