public class smallest_no {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,4};
        int smallest=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
    }
}
