class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result =0;
        HashMap<Integer,Integer> coutMap = new HashMap<>();

        for(int num : nums){
            coutMap.put(num,coutMap.getOrDefault(num ,0) +1);
        }
        for(Map.Entry<Integer,Integer> entry : coutMap.entrySet()){
            if(entry.getValue() < 2){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}