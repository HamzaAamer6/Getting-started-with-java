import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
    public static void main(String args[]){
        URLResource UR;
        UR= new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String Line:UR.words()){
            int ptr=Line.toLowerCase().indexOf("youtube.com");
                if(ptr!=-1){
                    int start=Line.lastIndexOf("\"",ptr);
                    int end=Line.indexOf("\"",ptr);
                    if(end==-1 || start==-1)continue;
                    end++;
                    System.out.println(Line.substring(start,end));
                }
        }
        
        
    }
}
