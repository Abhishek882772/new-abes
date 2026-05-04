class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        List<StringBuilder> li=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            li.add(new StringBuilder());
        }
        int r=0;
        int dir=1;
        for(int i=0;i<s.length();i++){
            li.get(r).append(s.charAt(i));
            if(r==0) dir=1;
            else if(r==numRows-1) dir=-1;
            r+=dir;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb:li){
            res.append(sb);
        }
        return res.toString();
    }
}