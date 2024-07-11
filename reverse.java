public class reverse {
    public static void main(String[] args) {
        int n=12345;
        while(n>0){
           int  Lastdigit=n%10;
            System.out.println(Lastdigit +"");
            n=n/10;
        }
        System.out.println();
    }
    
}
