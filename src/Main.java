public class Main {

    // Function de recherche
    public static Integer linearSearch(int [] array, int item) {
        // Loop
        for (int currentItem : array) {
            if (currentItem == item){
                return item;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(linearSearch(array, 8));
    }
}