class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c=maxHeap.poll();
            int freq=map.get(c);
            for (int i=0;i<freq;i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
