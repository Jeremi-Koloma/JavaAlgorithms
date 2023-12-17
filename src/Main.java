import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    // Function de recherche linear
    public static Integer linearSearch(int[] array, int item) {
        // Loop
        for (int currentItem : array) {
            if (currentItem == item){
                return item;
            }
        }
        return null;
    }


    // Function de recherche linear en Stream
    public static OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x== item).findFirst();
    }


    // function de recherche binary
    public static boolean binarySearch (int[] arr, int item) {
        int min = 0;
        int max = arr.length -1; // Pour récuperer le dernier index du tableau
        // Continuer la recherche tant que le min < max
        while (min <= max){
         // Gettons le milieu de l'element donnée pour faire la récherche
         int midle = (min + max) / 2;
         System.out.println("midle: "+midle);
         // Correspondance d'element à rechercher dans le tableau
            if (item == arr[midle]){
                return true; // trouver
            } else if (item < arr[midle]){
                max = midle - 1;
            } else {
                min = midle + 1;
                System.out.println(min);
            }
        }
        // element n'existe pas
        return false;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7,8};
        System.out.println(linearSearch(array, 9));
        linearSearch2(array, 3).ifPresent(System.out::println);
        System.out.println(binarySearch(array, 6));
    }
}