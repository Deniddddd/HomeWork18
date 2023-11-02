import java.util.Arrays;

public class Mat {
    public static void main(String[] args) {
        int[] array2D = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 1; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D));

        for (int index = 0; index < array2D.length / 2; index++) {
            int temp = array2D[index];
            array2D[index] = array2D[array2D.length - index - 1];
            array2D[array2D.length - index - 1] = temp;
        }
        }
        System.out.println(Arrays.toString(array2D));
            System.out.println();
    }
}
