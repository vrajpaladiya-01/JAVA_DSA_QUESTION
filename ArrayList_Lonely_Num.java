import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Lonely_Num {
    public static ArrayList<Integer> LonelyNum(ArrayList<Integer> num){
        Collections.sort(num);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<num.size()-1; i++){
            if(num.get(i-1) + 1 < num.get(i) && num.get(i) + 1 < num.get(i+1)){
                list.add(num.get(i));
            }
        }

        if(num.size() == 1){
            list.add(num.get(0));
        }

        if(num.size() > 1){
            if(num.get(0) + 1 < num.get(1)){
                list.add(num.get(0));
            }
            if (num.get(num.size()-2) + 1 < num.get(num.size()-1)) {
                list.add(num.get(num.size()-1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList();
        num.add(6);
        num.add(8);
        num.add(3);

        System.out.println(LonelyNum(num));
    }
}
