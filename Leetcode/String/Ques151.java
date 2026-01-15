//package Leetcode.String;

public class Ques151{
    //most optimized approach without using split and trim functions
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            i = copyNextWord(s, i, sb);
        }

        return sb.deleteCharAt(sb.length()-1).toString();
    }

    int copyNextWord(String s, int i, StringBuilder sb) {
        int end = -1, start = -1; // first and last chars or the word
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        for (; i >= -1; i--) {
            if (i == -1 || s.charAt(i) == ' ') {
                start = i + 1;
                break;
            }
        }

        if (end >= 0 && start >= 0) {
            sb.append(s.substring(start, end + 1));
            sb.append(" ");
        }

        return i;
    }
    public static void main(String[] args) {
        Ques151 rw = new Ques151();
        String s = "  hello world  ";
        String result = rw.reverseWords(s);
        System.out.println(result); // Output: "world hello"
    }
}


//use stringbuilder to solve this problem
//but however this also not that optimizesd as it uses split and trim functions
class Solution2 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            out.append(words[i]);
            if (i > 0) {
                out.append(" ");
            }
        }
        return out.toString();
    }
}

//Brute force approach
// i use split,trim and concat functions to solve this problem
class Solution1 {
    public String reverseWords(String s) {
        String regex = "[\\s]+";
        String[] array = s.trim().split(regex);
    String out="";
        for(int i=array.length-1;i>0;i--){
            out=out.concat(array[i]);
            out=out.concat(" ");
        }
        out=out.concat(array[0]);
        return out;
    }
}