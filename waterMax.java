public class waterMax {
    public static int maxArea(int[] height) {
            int low=0;
            int high=(height.length-1);
            int amount=0;
            while(low<high){
                if(height[low]<height[high]){
                    int amount_=height[low]*(high-low);
                    amount=Math.max(amount_,amount);
                    low++;
                }else{
                
                    int amount_=height[high]*(high-low);
                    amount=Math.max(amount_,amount);
                    high--;
                }
            }
            return amount;
    
        }
        public static void main(String[] args) {
            int [] height={1,8,6,2,5,4,8,3,7};
            System.out.println(maxArea(height));
    }
}