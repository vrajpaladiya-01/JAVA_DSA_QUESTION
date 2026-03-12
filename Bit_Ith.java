public class Bit_Ith {
    public static int GetIthBit(int n, int i){
        int bitMask = (1 << i);

        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int NewBit){
        // if(NewBit == 0){
        //     return ClearIthBit(n, i);
        // }
        // else{
        //     return SetIthBit(n, i);
        // }

        n = ClearIthBit(n, i);
        int bitMask = NewBit << i;
        return n | bitMask; 
    }

    public static int ClearBit(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int ClearRangeofI(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearBit(10, 2));
    }
}
