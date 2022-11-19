package matrices;

public class DiagonalSum {
	public int diagonalSum(int[][] mat) {
        int sum = 0; 
        int pos = 0; 
        // primary diagonal 
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][pos];
            pos++;
        }
        
        // secondary diagonal 
        for(int i = 0; i < mat.length; i++){
            pos--; 
            if(mat.length % 2 == 1 && pos == mat.length/2){
                continue;
            }else{
               sum+= mat[i][pos]; 
            } 
        }
        return sum;
    }
}
