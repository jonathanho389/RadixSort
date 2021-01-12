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
    return nums[col];
  }
}
