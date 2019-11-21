import java.util.*;

public class BlurryMemory {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] pixels = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                pixels[i][j] = sc.nextInt();
            }
        }
        
    
    }
}
