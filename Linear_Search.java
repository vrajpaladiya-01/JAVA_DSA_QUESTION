public class Linear_Search {

    public static int linearsearch(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static int linearfruit(String fruits[], String fav){

        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(fav)){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 11;

        String fruits[] = {"Mango", "Apple", "Guavava", "Banana", "Graps", "Watermalan"};
        String fav = "Graps"; 

        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("Index no is : " + index);
        }

        int indexfruit = linearfruit(fruits, fav);

        if(indexfruit == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index no is : " + indexfruit);
        }
    }
}
