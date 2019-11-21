import java.util.Scanner;

public class DorysMicrobes {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
    
        int[][] microbes = new int[n][n];
    
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                microbes[i][j] = scanner.nextInt();
            }
        }
        
        
    }
}
