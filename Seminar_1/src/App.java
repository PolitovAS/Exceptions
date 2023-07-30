public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getArrayLenght(new int[]{1,2,3,3,3,3}, 3));
    }

    /*
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторый допустимый минимум. 
     * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
     */
    public static int getArrayLenght(int[] array, int mininum){
        if(array.length < mininum){
            return -1;
        }
        return array.length;
    }
}
