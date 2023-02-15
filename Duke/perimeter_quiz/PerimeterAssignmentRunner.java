import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int counter=0;
        for (Point currPt : s.getPoints()) {
            counter++;
        }
        return counter;
    }

    public double getAverageLength(Shape s) {
        double sum=0,count=0;
        sum=getPerimeter(s);
        count=getNumPoints(s);
        return (double)sum/count;
    }

    public double getLargestSide(Shape s) {
        double largest=-1;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            prevPt = currPt;
            if(largest<currDist){
                largest=currDist;
            }
        }
        return largest;
    }

    public double getLargestX(Shape s) {
        double largest=-100;
        for (Point currPt : s.getPoints()) {
            if(largest<currPt.getX()){
                largest=currPt.getX();
            }
        }
        return largest;
    }

    public double getLargestPerimeterMultipleFiles() {
        String largestName;
        double largest=-1;
        DirectoryResource dr=new DirectoryResource();
        for(File f : dr.selectedFiles()){
            FileResource fr=new FileResource(f);
            Shape s=new Shape(fr);
            if (largest<getPerimeter(s)){
                largest=getPerimeter(s);
            }
        }
        return largest;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
            // replace this code
        String largestName="";
        double largest=-1;
        DirectoryResource dr=new DirectoryResource();
        for(File f : dr.selectedFiles()){
            FileResource fr=new FileResource(f);
            Shape s=new Shape(fr);
            if (largest<getPerimeter(s)){
                largest=getPerimeter(s);
                largestName=f.getName();
            }
        }
        return largestName;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        System.out.println("Num of Points = " + getNumPoints(s));
        System.out.println("Average Length = " + getAverageLength(s));
        System.out.println("GetLargestSide = " + getLargestSide(s));
        System.out.println("Largest X = " + getLargestX(s));
    }
    
    public void testPerimeterMultipleFiles() {
        System.out.println("testPerimeterMultipleFiles = "+getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        System.out.println("testFileWithLargestPerimeter = "+getFileWithLargestPerimeter());
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }
    
    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        /*pr.testPerimeter();
        PerimeterAssignmentRunner pr2 = new PerimeterAssignmentRunner();
        pr2.testPerimeter();
        PerimeterAssignmentRunner pr3 = new PerimeterAssignmentRunner();
        pr3.testPerimeter();
        PerimeterAssignmentRunner pr4 = new PerimeterAssignmentRunner();
        pr4.testPerimeter();*/
        pr.testPerimeterMultipleFiles();
        pr.testFileWithLargestPerimeter();
    }
}
