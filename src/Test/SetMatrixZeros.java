package Test;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][]matrix = {};

    }

    public void setMatrixZeros(int[][]matrix){
        boolean col = true;

        for(int i =0;i<matrix.length;i++){
            if(matrix[i][0]==0) col = false;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = matrix.length-1;i>=0;i--){
            for(int j = matrix[0].length-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
            if(!col) matrix[i][0]=0;
        }
    }
}
