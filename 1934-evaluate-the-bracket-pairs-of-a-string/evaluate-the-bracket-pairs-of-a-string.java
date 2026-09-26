class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String ,String> map=new HashMap<>();
        for(int k=0;k<knowledge.size();k++){
            map.put(knowledge.get(k).get(0),knowledge.get(k).get(1));
        }
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
        if(s.charAt(i) =='('){
            i++;
            int j=i;
            while(s.charAt(i) !=')'){
                i++;
            }
            if(map.containsKey(s.substring(j,i))) sb.append(map.get(s.substring(j,i)));
            else sb.append("?");
            i++;
        }
        else{sb.append(s.charAt(i));
        i++;}
        }
        return sb.toString();
    }
}