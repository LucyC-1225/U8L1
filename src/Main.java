import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[][] noDuplicates = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] oneDuplicates = {{1, 2, 2}, {2, 2, 3}, {4, 5, 6}};
        int[][] multipleDuplicates = {{1, 1, 2}, {2, 0, 3}, {1, 2, 3}};


        System.out.println("---------------Test case 1---------------");
        System.out.println("Input:");
        for (int[] row : noDuplicates){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: 0");
        System.out.println("Actual result: " + columnDuplicates(noDuplicates));

        System.out.println("---------------Test case 2---------------");
        System.out.println("Input:");
        for (int[] row : oneDuplicates){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: 1");
        System.out.println("Actual result: " + columnDuplicates(oneDuplicates));

        System.out.println("---------------Test case 3---------------");
        System.out.println("Input:");
        for (int[] row : multipleDuplicates){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected result: 2");
        System.out.println("Actual result: " + columnDuplicates(multipleDuplicates));

    }
    public static int columnDuplicates(int[][] arr){
        int num = 0;
        for (int c = 0; c < arr[0].length; c++){
            for (int r = 0; r < arr.length; r++){
                int test = arr[r][c];
                for (int i = r + 1; i < arr.length; i++){
                    if (test == arr[i][c]){
                        num++;
                    }
                }
            }
        }
        return num;
    }
}

