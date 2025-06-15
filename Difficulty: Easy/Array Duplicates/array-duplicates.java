class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(entry.getValue() > 1){
                result.add(entry.getKey());
            }
        }
        return result;

    }
}