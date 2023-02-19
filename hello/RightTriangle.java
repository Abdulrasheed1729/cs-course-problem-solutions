public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isPythagorean;
        isPythagorean = (a > 0 && b > 0 && c > 0);
        isPythagorean = isPythagorean && ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b));

   for (int i =0, j=0; i <10; i++) {
        j+=1;
       System.out.println(j);
   }

    }
}
