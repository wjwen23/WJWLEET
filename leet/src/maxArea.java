public class maxArea {
    public static int maxArea(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }
        int i = 0;
        //int j = height.length - 1;
        int area = 0;
        while(i < height.length){
            for(int j = i + 1;j < height.length;j ++){
                int temparea = calculatearea(i,j,height);
                area = Math.max(area, temparea);
            }
            i += 1;
        }
        return area;
    }
    protected static int calculatearea(int x, int y, int[] S){
        return Math.min(S[x] ,S[y]) * (y - x);
    }
}
