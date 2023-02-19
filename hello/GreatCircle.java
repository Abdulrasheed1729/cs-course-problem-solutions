public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double RADIUS = 6371.0;

        double distance;
        double sinSquaredX = Math.sin(Math.toRadians((x2 - x1) / 2));
        double sinSquaredY = Math.sin(Math.toRadians((y2 - y1) / 2));
        distance = 2 * RADIUS * Math.asin(Math.sqrt(sinSquaredX * sinSquaredX + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * sinSquaredY * sinSquaredY));
        System.out.println(distance + " kilometers");

    }
}
