
public class GeneralizedHarmonic {
    public static void main(String[] args){
        double n1=(double)Double.parseDouble(args[0]),n2=(double)Double.parseDouble(args[1]);
        double result=0;
        for (int x=1;x<=n1;x++){
            double power=x;
            power=Math.pow(power,n2);
            result+=(1/power);
        }
        System.out.print(result);
    }
}

