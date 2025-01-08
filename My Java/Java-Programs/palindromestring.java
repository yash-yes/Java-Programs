public class palindromestring {
    public static void main(String[] args) {
        String rev = "";
        int i;
        String s = "Deepak";
        for(i=s.length()-1;i>=0;i--)
        {
            rev = rev +s.charAt(i);

        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev))
        System.out.println("Palindrome ");
        else
        System.out.println("Not Palindrome");
    }
    
}
