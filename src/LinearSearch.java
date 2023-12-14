public class LinearSearch {
    public  Integer linearSearch(int [] array, int item) {
        // Loop
        for (int currentItem : array) {
            if (currentItem == item){
                return item;
            }
        }
        return null;
    }
}
