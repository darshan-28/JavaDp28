public class subtractionOfNumbers {
    public static void main(String[] args) {
        int n=12345;
        int r=0;
        int temp=n%10;
        n/=10;
        while(n>0)
        {
            r=n%10;
            temp=temp-r;
            n=n/10;        
        }
        System.out.println(temp);
    }
}
