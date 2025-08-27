class Solution {
    public boolean judgeCircle(String moves) {
        int v=0,h=0;
        for(char m:moves.toCharArray()){
            switch(m){
                case 'U':v++;break;
                case 'D':v--;break;
                case 'R':h++;break;
                case 'L':h--;break;
            }
        }
        return v==0 && h==0;

    }
}
