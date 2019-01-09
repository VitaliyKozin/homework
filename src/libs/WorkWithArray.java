package libs;

public class WorkWithArray {
    public static void fillingOfDiagonal(int arrayArray[][], int z) {
        for (int i = 0; i < arrayArray.length; i++) {

            if (arrayArray.length != arrayArray[i].length) {
                System.out.println("Диагональ невозможно заполнить так как матрица не квадратная");
                break;
            }
            for (int j = 0; j < arrayArray[i].length; j++) {


                if (j==arrayArray.length-1-i) {
                    arrayArray[i][j] = z;
                }
                /*else if (j==arrayArray.length-1-i){ //Зарезервирована правая диагональ
                    arrayArray[i][j] = z;
                }
                if (i == j) {
                    arrayArray[i][j] = z;
                }
                */
                System.out.print(" " + arrayArray[i][j]);
            }

            System.out.println();

        }

    }

}
