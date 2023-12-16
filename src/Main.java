import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    // Function de recherche linear
    public static Integer linearSearch(int [] array, int item) {
        // Loop
        for (int currentItem : array) {
            if (currentItem == item){
                return item;
            }
        }
        return null;
    }


    // Function de recherche linear en Stream
    public static OptionalInt linearSearch2(int [] arr, int item) {
        return Arrays.stream(arr).filter(x -> x== item).findFirst();
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(linearSearch(array, 8));
        linearSearch2(array, 3).ifPresent(System.out::println);
    }
}