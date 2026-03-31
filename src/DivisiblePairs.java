import java.util.Scanner;
public class DivisiblePairs {
        static Scanner sc = new Scanner(System.in);
        
        public static int[] arrInput(int n){
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i]= sc.nextInt();
                }
                return arr;
        }
        public static int divPair (int[]arr, int k){
                int num = 0;
                for(int i=0; i<arr.length; i++){
                        for(int j=(i+1); j<arr.length; j++){
                                int sum = arr[i]+arr[j];
                                if(sum%k == 0){
                                        num++;
                                }
                        }
                }
                return num;
        }

        // TODO: Read n and k
        // TODO: Read array elements
        // TODO: Count pairs (i, j) such that i < j and (arr[i] + arr[j]) % k == 0
        // TODO: Print the count
        public static void main(String[] args) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = arrInput(n);
                System.out.println(divPair(arr, k));
        }
}
