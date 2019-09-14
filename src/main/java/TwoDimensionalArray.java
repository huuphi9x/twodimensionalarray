public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Array list: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int max = array[0][0];
        int indexI = 0, indexJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Max of two-dimensional array is " + max + " at row " + indexI + ", column " + indexJ);
    }
}