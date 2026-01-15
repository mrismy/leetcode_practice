public class Ques283{
    public void moveZeroes(int[] nums) {
        int n1=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    int temp=nums[n1];
                    nums[n1]=nums[i];
                    nums[i]=temp;
                    n1++;
                }
        }
    }
    public static void main(String[] args) {
        Ques283 mz = new Ques283();
        int[] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
} 
    

