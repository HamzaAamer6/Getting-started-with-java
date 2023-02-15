
public class BandMatrix {
    public static void main(String[] args) {
        int dimensions = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int temp = 0;
        for (int x = dimensions; x > 0; x--) {
            for (int z = temp; z > 0; z--) {
                if (z <= width) System.out.print("*  ");
                else System.out.print("0  ");
            }
            for (int y = 0; y < x; y++) {
                if (y <= width) System.out.print("*  ");
                else System.out.print("0  ");
            }

            System.out.print('\n');
            temp++;
        }
    }
}