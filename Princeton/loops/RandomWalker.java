
public class RandomWalker {
    public static void main(String[] args){
        double distance=(double) Integer.parseInt(args[0]);
        int x=0,y=0;
        int steps=0;
        while(distance!=(Math.abs(x)+Math.abs(y))){
            System.out.println(" ("+x+", "+y+") ");
            int random=(int)Math.round(Math.random()*3)+1;
            switch(random){
                case 1:
                    x++;
                    break;
                case 2:
                    y++;
                    break;
                case 3:
                    x--;
                    break;
                case 4:
                    y--;
                    break;
            }
            steps++;
        }
        System.out.println(" ("+x+", "+y+") ");
        System.out.println("steps = "+steps);
    }
}
