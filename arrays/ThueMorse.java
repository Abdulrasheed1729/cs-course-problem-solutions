public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int powerOf2 = n;

        if ((n % 2) != 0) {
            powerOf2 = (int) Math.pow(2, Math.ceil(Math.log(n) / Math.log(2)));
        }
        boolean[] morseSequence = new boolean[powerOf2];
        morseSequence[0] = false;

        int indicator = 1;

        while (indicator < powerOf2) {
            for (int i = 0; i < indicator; i++) {
                morseSequence[indicator + i] = !morseSequence[i];
            }
            indicator *= 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (morseSequence[i] == morseSequence[j])
                    System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }

    }
}
