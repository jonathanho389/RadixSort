public class Radix{
  public static int nth(int n, int col){
    int temp = n;
    int digits = 0;
    while(temp != 0){
      temp /= 10;
      digits++;
    }
    int[] nums = new int[digits];
    for(int i = 0;i < digits;i++){
      nums[i] = n % 10;
      n /= 10;
    }
    return Math.abs(nums[col]);
  }

  public static int length(int n){
    int temp = n;
    int digits = 0;
    if(temp == 0){
      return 1;
    }
    else{
        while(temp != 0){
        temp /= 10;
        digits++;
      }
    }
    return digits;
  }
}
