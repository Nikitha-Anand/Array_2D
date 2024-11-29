import java.util.Objects;

public class Array_2D {
    public Array_2D(){}
    static Integer[][] Array = new Integer[10][10];

    static {
        for(int i= 0; i< 10; i++) {
            for (int j = 0; j < 10; j++) {
                Array[i][j] = (int) ((Math.random()*97)+2);
            }
        }
    }

    public static void BubbleSort(){
        int ArrayLength = 10;
        for (int X= 0; X<= ArrayLength - 1; X++) {
            for (int Y= 0; Y<= ArrayLength - 2; Y++) {
                for (int Z = 0; Z <= ArrayLength - Y - 2; Z++) {
                    if(Array[X][Z] > Array[X][Z+1]){
                        Integer TempValue = Array[X][Z];
                        Array[X][Z] = Array[X][Z+1];
                        Array[X][Z+1] = TempValue;
                    }
                }
            }
        }
    }

    public static void PrintArray(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Integer BinarySearch(Integer Lower, Integer Upper, Integer SearchValue){
        if(Upper >= Lower){
            int Mid = ((Lower + (Upper))/2);
            if(Objects.equals(Array[0][Mid], SearchValue)){
                return Mid;
            }else{
                if(Array[0][Mid] > SearchValue){
                    return BinarySearch(Lower,Mid - 1, SearchValue);
                }else{
                    return BinarySearch(Mid + 1,Upper, SearchValue);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        
        System.out.println("Before BubbleSort: \n");
        PrintArray();

        BubbleSort();

        System.out.println("\nAfter BubbleSort: \n");
        PrintArray();


        Integer search = BinarySearch(0,9,37);
        if(search == -1){
            System.out.println("\nNumber 37 not in the Array");
        }else{
            System.out.println("\nNumber 37 was found in index: "+search);
        }
    }
}


