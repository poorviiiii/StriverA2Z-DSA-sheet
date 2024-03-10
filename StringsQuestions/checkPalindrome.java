package StringsQuestions;

public class checkPalindrome {
    public static boolean ispalindrome(String str ,int start,int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
         return true;
    }
    public static boolean ispalindrome(String str){
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(str.length()<1){
            return true;
        }
        return ispalindrome(str,0,str.length()-1);
    }
    public static void main(String args[]){
        String str="*a*&#ab&&baa**";
        if(ispalindrome(str)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not Palindrome string");
        }
    }
    
}
