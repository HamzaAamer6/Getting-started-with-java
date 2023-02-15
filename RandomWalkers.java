
public class RandomWalkers {
    public static void main(String[] args) {
        double sum = 0;
        int count = Integer.parseInt(args[1]);
        for (int c = 0; c < count; c++) {
            double distance = (double) Integer.parseInt(args[0]);
            int x = 0, y = 0;
            int steps = 0;
            while (distance != (Math.abs(x) + Math.abs(y))) {
                int random = (int) Math.round(Math.random() * 3)+1;
                switch (random) {
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
            sum+=steps;
        }
        System.out.println("average number of steps = "+ sum/count);
    }
}
