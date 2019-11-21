import java.util.Scanner;

public class SortingShells {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] shells = new int[n];
        
        for(int i = 0; i < n; i++)
            shells[i] = sc.nextInt();
        
        int k = sc.nextInt();
        int[] gaps = new int[k];
        for(int i = 0; i < k; i++)
            gaps[i] = sc.nextInt();
        
        
    
    }

}
