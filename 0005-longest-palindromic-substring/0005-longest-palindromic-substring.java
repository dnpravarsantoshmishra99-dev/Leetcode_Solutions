 class Solution {
    public String longestPalindrome(String s) {
        String res=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            int m=i-1;
            int n=i+1;
            while(m>=0 && n<s.length()){
                if(s.charAt(m)==s.charAt(n)){
                    if(res.length()<n-m+1){
                        res =s.substring(m,n+1);
                    }
                    m--;
                    n++;
                }else{
                    break;
                }
            }

            m=i;
            n=i+1;
            while(m>=0 && n<s.length()){
                if(s.charAt(m)==s.charAt(n)){
                    if(res.length()<n-m+1){
                        res =s.substring(m,n+1);
                    }
                    m--;
                    n++;
                }else{
                    break;
                }
            }
        }
        return res;
    }
}