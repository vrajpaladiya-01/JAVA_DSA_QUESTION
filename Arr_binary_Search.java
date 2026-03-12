public class Arr_binary_Search {
    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(num[mid] == key){
                return mid;
            }

            if(num[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        System.out.println("Key of Index : " + binarySearch(num, key));
    }
}
