public class stringlength {
    public static void main(String[] args) {
        String r = "Book";
        int strlength = 0;
        for(char c: r.toCharArray())
        {
            strlength++;

        }
        System.out.println("The length of string is  "+  strlength);
    }
}
