import java.lang.reflect.Array;

public class Sorting {
    public static void main(String[] args){
        int [] array = {34,4,55,66,45, 0,-3,444};
        int[]  arraysorted = sorting(array);
        for(int i : arraysorted){
            System.out.println(i);


        }
    }
    public static int[] sorting (int[] list){
        int max = list[0];
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length-1; j++){
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }

            }
        }
        return list;

    }
}

