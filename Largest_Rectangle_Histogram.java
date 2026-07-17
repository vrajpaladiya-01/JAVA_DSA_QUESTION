public class Largest_Rectangle_Histogram {
    public static int Rec_Histogram(int value[]){

        int maxValue = 0;

        for(int i=0; i<value.length; i++){
            int minHeight = value[i];

            for(int j=i; j<value.length; j++){
                minHeight = Math.min(minHeight, value[j]);
                int width = j - i + 1;

                int area = minHeight * width;
                maxValue = Math.max(maxValue, area);
            }
        }

        return maxValue;
    }
    public static void main(String[] args) {
        int value[] = {2, 1, 2};
        System.out.println("Maximum Rectangle histogram is : " + Rec_Histogram(value));
    }
}