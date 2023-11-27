import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    class Solution {
        List<List<Integer>> combos = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> temp = new ArrayList<>();
            combos.add(new ArrayList<>());

            for(int i = 0; i < nums.length; i++){
                createCombos(nums,i,temp);
            }

            return combos;
        }

        private void createCombos(int[] nums, int index, List<Integer> temp){
            if(index >= nums.length){
                return;
            }

            temp.add(nums[index]);
            System.out.println(nums[index]);
            System.out.println(Arrays.toString(temp.toArray()));
            combos.add(new ArrayList<>(temp));

            for(int i = index+1; i < nums.length; i++){
                createCombos(nums,i,temp);
            }

            temp.remove(temp.size()-1);


        }
    }
}