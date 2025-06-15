class Solution {
    int missingNum(int arr[]) {
         if(arr.length==1 & arr[0]==1){
          return arr[0]+1;
      }
      Arrays.sort(arr);
      
      for(int i=0;i<arr.length;i++){
          if(i==arr.length-1 & arr[arr.length-1]==i+1){
              return arr.length+1;
          }
          if(arr[i]!=i+1){
              return i+1;
          }
      }
      return -1;
    }
}