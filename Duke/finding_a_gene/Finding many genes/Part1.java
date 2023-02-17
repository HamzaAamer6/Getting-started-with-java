import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part1 here.
 * 
 * @author hamza-aamer
 * @version (a version number or a date)
 */
public class Part1 {
    int findStopCodon(String dna,int startIndex,String stopCodon){
        int end=0;
        int temp=startIndex;
        while(end!=-1){
            end=dna.toUpperCase().indexOf(stopCodon,temp);
            if ((end-startIndex)%3==0){
                return end;
            }
            System.out.print("\""+end+"\"");
            temp=end+stopCodon.length();
        }
        return -1;
    }
    void testFindStopCodon(){
        String test1="---_TAA--TAA---";
        String test2="---TAA___TAA---TAA";
        String test3="123456789-----TAA----TAA";
        String test4="123TAA---TAA";
        System.out.println("Getting Results!\n");
        System.out.println(" 1 :"+findStopCodon(test1,0,"TAA"));
        System.out.println(" 2 :"+findStopCodon(test2,0,"TAA"));
        System.out.println(" 3 :"+findStopCodon(test3,9,"TAA"));
        System.out.println(" 4 :"+findStopCodon(test4,3,"TAA"));
        
    }
    
    String findGene(String dna){
        int start=dna.toUpperCase().indexOf("ATG");
        if(start==-1){
            return "";
        }
        int taa=findStopCodon(dna,start,"TAA");
        int tag=findStopCodon(dna,start,"TAG");
        int tga=findStopCodon(dna,start,"TGA");
        if((taa ==-1) && (tag==01) && (tga==01)) return "";
        int max=-1;
        if (taa>tag && taa>tga) max=taa;
        if (tag>taa && tag>tga) max=taa;
        if (tga>taa && tga>tag) max=taa;
        
        return dna.substring(start,max+3);
    }
    void testFindGene(){
        String test1="------ATG---_TAA--TAA---";//should print ATG---_TAA--TAA
        String test2="---TAA___TAA---TAA";//should print nothing
        String test3="ATG123456789-----TAA----TAA"; //should printeverything
        String test4="12ATG3TAA--TAA";//shouldprint ATG3TAA--TAA
        String test5="12ATGTGA--TAA";//shouldprint ATGTGA
        
        System.out.println("Getting Results!\n");
        System.out.println(" 1 :"+findStopCodon(test1,0,"TAA"));
        System.out.println(" 2 :"+findStopCodon(test2,0,"TAA"));
        System.out.println(" 3 :"+findStopCodon(test3,9,"TAA"));
        System.out.println(" 4 :"+findStopCodon(test4,3,"TAA"));
        
    }
}
