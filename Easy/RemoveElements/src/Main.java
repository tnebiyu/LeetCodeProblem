public class Main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 3));
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }
public static int removeElement(int[] nums , int val){
        int j=0;
        for (int i=0; i<nums.length; i++){
            if (val != nums[i]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
}
}