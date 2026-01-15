class Ques392 {
    public boolean isSubsequence(String s, String t) {
        char strs[] = s.toCharArray();
        char strt[] = t.toCharArray();
        int len=strs.length,n=0;

        for(int i=0;i<strt.length && n<len;i++){
            if(strt[i]==strs[n]){
                n++;
            }
        }
        return n==len;
    }
    public static void main(String[] args) {
        Ques392 subseq = new Ques392();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = subseq.isSubsequence(s, t);
        System.out.println(result); // Output: true
    }
}