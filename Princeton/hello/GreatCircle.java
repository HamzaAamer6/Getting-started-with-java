
public class GreatCircle {
    public static void main(String[] args){
        double x1 =Double.parseDouble(args[0]),y1=Double.parseDouble(args[1]),x2 =Double.parseDouble(args[2]),y2=Double.parseDouble(args[3]);
        double distance = 2*6371.0;
        x1=Math.toRadians(x1);
        x2=Math.toRadians(x2);
        y1=Math.toRadians(y1);
        y2=Math.toRadians(y2);
        double inner= (Math.sin((x2-x1)/2)*Math.sin((x2-x1)/2)) + Math.cos(x1)*Math.cos(x2)*(Math.sin((y2-y1)/2)*Math.sin((y2-y1)/2));
        double result = distance * Math.asin(Math.sqrt(inner));
        System.out.println(result + " kilometers");
    }
}
