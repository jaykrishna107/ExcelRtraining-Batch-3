public class Demo068 {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        int count = 0;
        for(int i = 0; i<arr.length; i++){
                if(arr[i] %2 == 0){
                     count++;
                    }
                    System.out.println("Even numbers are: "+count);
                }
        }
} 
