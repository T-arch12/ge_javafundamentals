package datatypes;

public class LoopDemo {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println("For loop output:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enchanced for loop output:");
        for(int num: arr){
            System.out.println(num);
        }
    }
}
