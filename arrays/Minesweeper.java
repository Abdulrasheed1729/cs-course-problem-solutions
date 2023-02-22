public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] hasMine = new boolean[m + 2][n + 2];
        int[][] neighbouringMines = new int[m + 2][n + 2];

        while (k > 0) {
            int rx = 1 + (int) (Math.random() * m);
            int ry = 1 + (int) (Math.random() * n);
            if (!hasMine[rx][ry]) {
                hasMine[rx][ry] = true;
                k--;
            }
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (!hasMine[i][j]) {
                    int mines = 0;
                    for (int l = i - 1; l <= i + 1; l++) {
                        for (int p = j - 1; p <= j + 1; p++) {
                            if (hasMine[l][p]) {
                                mines++;
                            }
                        }
                    }
                    neighbouringMines[i][j] = mines;
                } else {
                    neighbouringMines[i][j] = -1;
                }
            }
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (neighbouringMines[i][j] < 0) {
                    System.out.print((j == 1 ? "" : " ") + "*" + (j == n ? "" : " "));
                } else {
                    System.out.print((j == 1 ? "" : " ") + neighbouringMines[i][j] + (j == n ? "" :
                            " "));
                }
            }
            System.out.println();
        }
    }
}
