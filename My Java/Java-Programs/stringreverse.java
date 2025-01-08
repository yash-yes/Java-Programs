public class stringreverse {
    public static void main(String[] args) {
        String r = "We are learning java";
        String b[] = r.split(" ");
        for(int i =b.length-1;i>=0;i--)
        {
            System.out.print(b[i] + " ");
        }

    }
}
