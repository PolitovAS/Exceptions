import java.util.Arrays;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class task_02 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"}
    };

    String[][] arr = new String[][] {
            {"1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "2"},
            {"3", "3"},
            {"2", "6"}
    };
    // String[][] arrNew = fillArr(arr);
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(Arrays.toString(arrNew[i]));
    // }
    
    System.out.println(sum2d(arr0));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        // arr = fillArr(arr);
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Это не число");
        } catch (ArrayIndexOutOfBoundsException e) {
            sum = sum2d(fillArr(arr, 5));
            
        }
        return sum;
        
    }

    private static String[][] fillArr(String[][] arr, int length){
        for (int i = 0; i < arr.length; i++) {
            String[] elem = arr[i];
            if (elem.length < length){
                String[] temp = new String[length];
                System.arraycopy(elem, 0, temp, 0, elem.length); // temp = {"1","1","null","null","null"}
                for (int j = elem.length; j < length; j++) {
                    temp[j] = "0";
                }
                elem = temp;
                arr[i] = elem;
            }
        }
        return arr;
    }
}