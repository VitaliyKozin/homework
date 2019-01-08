import libs.WorkWithArray;

public class Mainclass {

    public static void main(String[] args) {

        try {
            int k = 1;
            int arrayArray[][] = new int[5][5];
            WorkWithArray.fillingOfDiagonal(arrayArray, k);
        } catch (Exception e) {
            System.out.println("Error 1 = " + e);
          }
          /*catch (NumberFormatException e){
              System.out.println("Error 2 = " + e );
            }*/
    }

}