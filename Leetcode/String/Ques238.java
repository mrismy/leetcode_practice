public class Ques238 {
    public int[] productExceptSelf(int[] nums) {
        int answer[] =new int[nums.length];
        int prod=1;
        int len=nums.length;
        for(int i=0;i<len;i++){
            answer[i]=prod;
            prod=prod*nums[i];
        }
        prod=1;
        for(int i=len-1;i>=0;i--){
            answer[i]=prod*answer[i];
            prod=nums[i]*prod;
            
        }
        return answer;
    }
    public static void main(String[] args) {
        Ques238 ps = new Ques238();
        int nums[] = {1,2,3,4};
        int result[] = ps.productExceptSelf(nums);
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}

