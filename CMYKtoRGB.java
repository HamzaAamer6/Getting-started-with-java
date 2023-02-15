
public class CMYKtoRGB {
    public static void main(String[] args){
        double c=Double.parseDouble(args[0]),m=Double.parseDouble(args[1]),y=Double.parseDouble(args[2]),k=Double.parseDouble(args[3]);
        int r,g,b;
        double w;
        w=1-k;
        r= (int) Math.round(255*w*(1-c));
        g=(int) Math.round(255*w*(1-m));
        b=(int) Math.round(255*w*(1-y));
        System.out.println("red\t= "+r +"\ngreen\t= "+g+"\nblue\t= "+b);

    }
}
