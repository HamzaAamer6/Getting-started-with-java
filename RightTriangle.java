
public class RightTriangle {
    public static void main(String[] args){
        int a=Math.abs(Integer.parseInt(args[0]));
        int b=Math.abs(Integer.parseInt(args[1]));
        int c=Math.abs(Integer.parseInt(args[2]));

        boolean result =(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b);
        System.out.print(result);
    }
}
