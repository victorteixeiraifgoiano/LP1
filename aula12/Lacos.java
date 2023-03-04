package aula12;

import java.util.Arrays;

public class Lacos {

    public static void main(String[] args) {

        // PRIMEIRA TABELA

        int[][] tabela = new int[3][10];

        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                tabela[i][j] = j;
                System.out.print(" " + tabela[i][j] + " ");
            }
            System.out.println();
        }

        // SEGUNDA TABELA
        System.out.println("-------------");

        int[][] tabela2 = new int[5][10];

        for (int i = 0; i < tabela2.length; i++) {
            for (int j = 0; j < tabela2[i].length; j++) {
                tabela2[i][j] = j * j;
                System.out.print(" " + tabela2[i][j] + " ");
            }
            System.out.println();
        }

        // TERCEIRA TABELA
        System.out.println("-------------");

        int[][] tabela3 = new int[6][6];

        for (int i = 0; i < tabela3.length; i++) {
            for (int j = 0; j < tabela3[i].length; j++) {
                tabela3[i][j] = i;
                System.out.print(" " + tabela3[i][j] + " ");
            }
            System.out.println();
        }

        // // QUARTA TABELA
        // System.out.println("-------------");

        // int[][] tabela4 = new int[6][6];

        // for (int i = 0; i < tabela4.length; i++) {
        // if
        // for (int j = 0; j < tabela4[i].length; j++) {
        // tabela4[i][j] = -1;
        // System.out.print(" " + tabela4[i][j] + " ");
        // }
        // System.out.println();
        // }

        System.out.println("--------solução doida do adson------------");

        int[][] n = new int[6][6];

        for (int x = 0; x < n.length; x++) {
            for (int y = 0; y < n[x].length; y++) {
                n[x][y] = -1 * ((x + 1) % 2);

            }
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(Arrays.toString(n[i]));
        }

        int x = 0;

        System.out.println((0 + 1) % 2);
    }

}
