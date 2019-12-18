import java.util.List;

class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = null;
        int length = matrix.length;//行
        int depth = matrix[0].length;//列
        int[][] submatrix = new int[0][0];
        List<Integer> subList = spiralOrder(submatrix);
        resultList.addAll(subList);
        if(matrix == null){
            return null;
        }
        //resultList.add(matrix[0][0]);
        for(int i = 0;i < depth;i++){
            resultList.add(matrix[0][i]);
        }
        if(length > 1){
            for(int j = 0;j < length; j++){

            }
        }




        return resultList;
    }
    public void main(String args[]){
        List<Integer> L1 = null;
        L1.add(1);
        //L2.add

    }
}