

class Solution {
  public static void main(String[] args) {
  int[] arr ={-1,2,3,4,5};
int target=11;
int count =0;

for (int i=0; i<arr.length;i++){
  int left =i+1;
  int right =arr.length-1;


    while(left<right){
     int sum=arr[i]+arr[left]+arr[right];

     if(sum < target){
        
        count+= right-left;
        left++;
      }else{
        right--;
     }
    }
  }
 
System.out.println(count);
}
}