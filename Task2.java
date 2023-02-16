package Seminar1.hw1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1,2,1,2,-1,1,3,1,3,-1,0};
        int Sum=0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1]<0){
                Sum+=array[i];
            }
        }
        System.out.println(Sum);
    }


}
