package Test;

public class UniquePathsIII {
    public static void main(String[] args) {
        int[][]matrix = {{},{},{}};
        int zeros = 0;
        int startRow = 0;
        int startCol=0;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) zeros++;
                else if(matrix[i][j]==1){
                    startRow=i;
                    startCol=j;
                }
            }
        }


        helper(startRow,startCol,zeros,matrix);
    }

    private static int helper(int startRow, int startCol, int zeros, int[][] matrix) {
        if(startRow<0 || startCol<0 || startRow>matrix.length || startCol>matrix[0].length || matrix[startRow][startCol]==-1){
            return 0;
        }

        if(matrix[startRow][startCol]==2){
            return zeros==-1?1:0;
        }

        matrix[startRow][startCol]=-1;
        zeros--;
        int totalPaths = helper(startRow+1,startCol,zeros,matrix)+
                helper(startRow-1,startCol,zeros,matrix)+
        helper(startRow,startCol+1,zeros,matrix)+
        helper(startRow,startCol-1,zeros,matrix);
        matrix[startRow][startCol]=0;
        zeros++;
        return totalPaths;


    }
}
