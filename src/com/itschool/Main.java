package com.itschool;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Na_yroke_5_Example_1();
        Na_yroke_5_Example_2();
        Na_yroke_5_Example_3();
        Na_yroke_5_Example_4();
        Na_yroke_5_Example_5();
        Na_yroke_5_Example_6();
        Na_yroke_5_Example_7();
    }
    private static void Na_yroke_5_Example_1(){
        System.out.println("\n\n Example_1  -  Программа находит наименьшее и наибольшее значение двумерного массива вещественных чисел B[m,n]:");
        Random rnd = new Random();
        int m = 5;
        int n = 5;
        float[][] B = new float[m][n];
        float minN = 0;
        float maxN = 0;
        System.out.println("Двумерный массив вещественных чисел  B["+m+"]["+n+"]: ");
        for (m = 0; m < B.length; m++){
            for (n = 0; n < B[m].length; n++){
                B[m][n] = rnd.nextFloat() * 10 - 5;   // * 10 - 5  использовал чтобы были и отрицательные и положительные числа
                if ((m == 0) && (n == 0)){
                    maxN = B[m][n];
                    minN = B[m][n];
                }
                if (B[m][n] > maxN) maxN = B[m][n];
                if (B[m][n] < minN) minN = B[m][n];

                if (n == (B[m].length -1))System.out.println("  "+B[m][n]);
                else System.out.print("  "+B[m][n]);
            }
        }
        System.out.println("Минимальное значение в данном массиве равно: "+minN+" , а максимальное: "+maxN);
    }
    private static void Na_yroke_5_Example_2(){
        System.out.println("\n\n Example_2  -  Программа вычисляет сумму элементов расположенных на главной диагонали массива C[15][15]: ");
        int[][] C = new int[15][15];
        Random rnd = new Random();
        int summaD = 0;
        System.out.println("Двумерный массив С[15][15]: ");
        for (int i = 0; i < C.length; i++){
            for (int j = 0; j < C[i].length; j++){
                C[i][j] = rnd.nextInt(100);
                if (i == j) summaD += C[i][j];
                if (j == (C[i].length - 1)) System.out.println("  "+C[i][j]);
                else System.out.print("  "+C[i][j]);
            }
        }
        System.out.println("Сумма элементов расположенных на главной диагонали равна: "+summaD);
    }
    private static void Na_yroke_5_Example_3(){
        System.out.println("\n\n Example_3  -  Программа находит ноиер строки и столбца для максимального и минимального элемента в двумерном массиве: ");
        int[][] Z = new int[10][10];
        int[] iMax = {0, 0};       //массив хранящий индексы максимального элемента
        int[] iMin = {0, 0};       //массив хранящий индексы минимального элемента
        Random rnd = new Random();
        System.out.println("\nДвумерный массив: ");
        for (int row = 0; row < Z.length; row++){
            for (int cloumn = 0; cloumn < Z[row].length; cloumn++){
                Z[row][cloumn] = rnd.nextInt(50) + 10;
                if (Z[row][cloumn] > Z[iMax[0]][iMax[1]]){
                    iMax[0] = row;
                    iMax[1] = cloumn;
                }
                if (Z[row][cloumn] < Z[iMin[0]][iMin[1]]){
                    iMin[0] = row;
                    iMin[1] = cloumn;
                }
                if (cloumn == (Z[row].length - 1)) System.out.println("  "+Z[row][cloumn]);
                else System.out.print("  "+Z[row][cloumn]);
            }
        }
        System.out.println("\n Индексы максимального элемента массива - строка "+(iMax[0]+1)+" , столбец "+(iMax[1]+1)+" ;");
        System.out.println("Индексы минимального элемента массива - строка "+(iMin[0]+1)+" , столбец "+(iMin[1]+1)+" .");
    }
    private static void Na_yroke_5_Example_4(){
        System.out.println("\n\n Example_4  -  Программа находит наибольшую сумму абсолютных значений сроки и столбца двумерного массива: ");
        int[][] T = new int[10][10];
        int rowSumm = 0;
        int cloumnSumm =0;
        int rowMax = 0;
        int cloumnMax = 0;
        int iRow = 0;
        int iCloumn = 0;
        int mod = -2;
        Random rnd = new Random();
        System.out.println(" Двумерный массив: ");
        for (int i = 0; i < T.length; i++){
            for (int j = 0; j < T[i].length; j++){
                T[i][j] = rnd.nextInt(20) - 10;
                if (j == (T[i].length - 1)) System.out.println("  "+T[i][j]);
                else System.out.print(" "+T[i][j]);
            }
        }
        for (int i = 0; i < T.length; i++){
            for (int j = 0; j < T[i].length; j++){
                if (T[i][j] < 0) rowSumm += (T[i][j] + mod * T[i][j]);
                else rowSumm += T[i][j];
            }
            if (rowMax < rowSumm){
                rowMax = rowSumm;
                iRow = i;
            }
            rowSumm = 0;
        }
        for (int j = 0; j < T[0].length; j++){
            for (int i = 0; i < T.length;){
                if (T[i][j] < 0) cloumnSumm += (T[i][j] + mod * T[i][j]);
                else cloumnSumm += T[i][j];
                i++;
            }
            if (cloumnMax < cloumnSumm){
                cloumnMax = cloumnSumm;
                iCloumn = j;
            }
            cloumnSumm = 0;
        }
        System.out.println("Максимальная сумма строки равна "+rowMax+" , номер строки - "+(iRow + 1)+" ;");
        System.out.println("Максимальная сумма столбца равна "+cloumnMax+" , номер столбца - "+(iCloumn + 1)+" .");
    }
    private static void Na_yroke_5_Example_5(){
        System.out.println("\n\n Example_5  -  Программа находит колличество максимальных и минимальных элементов в двумерном массиве: ");
        int[][] Y = new int[10][10];
        int nMax = 0;
        int nMin = 0;
        int xMax = 0;
        int xMin = 0;
        Random rnd = new Random();
        System.out.println(" Двумерный массив: ");
        for (int i = 0; i < Y.length; i++){
            for (int j = 0; j < Y[i].length; j++){
                Y[i][j] = rnd.nextInt(10);
                if (j == (Y[i].length - 1))System.out.println("  "+Y[i][j]);
                else System.out.print("  "+Y[i][j]);
                if ((i != 0) || (j != 0)) {
                    if (xMax < Y[i][j]) {
                        xMax = Y[i][j];
                        nMax = 1;
                    } else if (xMax == Y[i][j]) ++nMax;
                    if (xMin > Y[i][j]) {
                        xMin = Y[i][j];
                        nMin = 1;
                    } else if (xMin == Y[i][j]) ++nMin;
                } else {
                    xMax = Y[i][j];
                    xMin = Y[i][j];
                    nMax = 1;
                    nMin = 1;
                }
            }
        }
        System.out.println("\n Колличество максимальных элементов массива "+nMax+" ;");
        System.out.println(" Колличество минимальных элементов массива "+nMin+" .");
    }
    private static void Na_yroke_5_Example_6(){
        System.out.println("\n\n Example_6  -  Программа находит в каждом столбце двумерного массива  -  сумму нечетных элементов; колличество положительных элементов; колличество элементов кратных a или b : ");
        Random rnd = new Random();
        int[][] cL = new int[10][10];
        int nechSumm = 0;
        int nPluse = 0;
        int nKrat = 0;
        int a = 2;
        int b = 3;
        System.out.println(" Двумерный массив:");
        for (int i = 0; i < cL.length; i++){
            for (int j = 0; j < cL[i].length; j++){
                cL[i][j] = rnd.nextInt(18) - 9;
                if (cL[i][j] < 0){
                    if (j != (cL[i].length - 1)) System.out.print("  "+cL[i][j]);
                    else System.out.println("  "+cL[i][j]);
                } else {
                    if (j != (cL[i].length - 1)) System.out.print("   "+cL[i][j]);
                    else System.out.println("   "+cL[i][j]);
                }
            }
        }
        System.out.println("\n  Номер столбца  |  Сумма неч. элем.  |  Кол-во полож. элем.  |  Кол-во элем. кратных a или b");
        for (int j = 0; j < cL[0].length; j++){
            for (int i = 0; i < cL.length;){
                if ((cL[i][j] % a) != 0) nechSumm += cL[i][j];
                if (cL[i][j] > 0) nPluse++;
                if (((cL[i][j] % a) == 0) || ((cL[i][j] % b) == 0)) nKrat++;
                i++;
            }
            System.out.println("         "+j+"       |          "+nechSumm+"          |          "+nPluse+"           |          "+nKrat);
            nechSumm = 0;
            nKrat = 0;
            nPluse = 0;
        }
    }
    private static void Na_yroke_5_Example_7(){
        System.out.println("\n\n Example_7  -  Программа меняет строки местами в массиве с четным числом строк, первую со второй, третью с четвертой и т.д.:");
        int temp;
        int[][] Z = {
                {1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6, 6},
        };
        System.out.println(" Двумерный массив: ");
        for (int[] i:Z){
            for (int a:i){
                System.out.print("  "+a);
            }
            System.out.println(" ");
        }
        System.out.println(" Массив после перестановки строк: ");
        for (int i = 0; i < Z.length; i += 2){
            for (int j = 0; j < Z[i].length; j++){
                temp = Z[i][j];
                Z[i][j] = Z[i+1][j];
                Z[i+1][j] = temp;
            }
        }
        for (int[] i:Z){
            for (int a:i){
                System.out.print("  "+a);
            }
            System.out.println(" ");
        }
    }
}
