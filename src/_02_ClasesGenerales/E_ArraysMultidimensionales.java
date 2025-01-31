package _02_ClasesGenerales;

import java.util.Arrays;
import java.util.Random;

public class E_ArraysMultidimensionales {
    public static void main(String[] args) {
        int[][] campo = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = random.nextInt(1000)+1;
            }
        }

        for (int i = 0; i < campo.length; i++) {
            System.out.println(Arrays.toString(campo[i]));
        }

        int maximo = campo[0][0];
        int rowMax = 0;
        int colMax = 0;
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                if (maximo < campo[i][j]) {
                    maximo = campo[i][j];
                    colMax = j;
                    rowMax = i;
                }
            }
        }

        System.out.println(maximo + ": " + rowMax + "," + colMax);

//        char[][][] campo3d = new char[10][10][10];
//
//        for (int i = 0; i < campo3d.length; i++) {
//            for (int j = 0; j < campo3d[i].length; j++) {
//                for (int k = 0; k < campo3d[i][j].length; k++) {
//
//                }
//            }
//        }


    }
}
