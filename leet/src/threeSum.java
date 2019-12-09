import java.util.List;
import java.util.ArrayList;
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> B = new ArrayList<>();
        for(int x = 0;x < nums.length;x ++){
            for(int y = x + 1;y < nums.length;y ++){
                for(int z = y + 1;z <nums.length;z ++){
                    ABC:if(0 == nums[x] + nums[y] + nums[z]){
                        List<Integer> A = new ArrayList<Integer>();
                        A.add(nums[x]);
                        A.add(nums[y]);
                        A.add(nums[z]);
                        for (List C:B) {
                            if(checkDiffrent(C, A)){
                                break ABC;
                            }
                        }
                        B.add(A);
                    }
                }
            }
        }
        return B;
    }
    private static boolean checkDiffrent(List<Integer> list, List<Integer> list1) {
        long st = System.nanoTime();
        if(list.size() != list1.size()) {
            //System.out.println("消耗时间：" + (System.nanoTime() - st));
            return false;
        }
        for(int str : list) {
            if(!list1.contains(str)) {
                //System.out.println("消耗时间：" + (System.nanoTime() - st));
                return false;
            }
        }
        //System.out.println("消耗时间：" + (System.nanoTime() - st));
        return true;
    }

}
