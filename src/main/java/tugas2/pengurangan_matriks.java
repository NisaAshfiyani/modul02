
package tugas2;

public class pengurangan_matriks {
    public static void main(String[] args) {
        int[][] A = {
            {4, 6},
            {2, 4},
            {8, 7}
        };
        
        int[][] B = {
            {3, 7, 5},
            {5, 2, 6}
            
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int[A.length] [A[0].length];
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<A[0].length; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
                for(int[] c: C)   {
                    for(int q: c) {
                        System.out.print(q+" ");
                    }
                    System.out.println();
                }
        }
        
    }
}
  
