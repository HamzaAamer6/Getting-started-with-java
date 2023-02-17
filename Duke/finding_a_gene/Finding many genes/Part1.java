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
            //System.out.print("\""+(end-startIndex)+"\"");
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
        //System.out.print("\n TAG : "+tag+"\n TAA : "+taa+"\n TGA : "+tga+"\n");
        if((taa ==-1) && (tag==01) && (tga==01)) return "";
        int max=-1;
        if (taa>tag && taa>tga) max=taa;
        if (tag>taa && tag>tga) max=tag;
        if (tga>taa && tga>tag) max=tga;
        
        return dna.substring(start,max+3);
    }
    void testFindGene(){
        String test1="AATGCTAACTAGCTGACTAAT";//should print ATG---_TAA--TAA

        
        System.out.println("Getting Results!\n");
        System.out.println(" 1 :"+findGene(test1));
        
    }
    void printAllGenes(String dna){
        int start=0;
        int end=dna.length();
        int counter=0;
        while(findGene(dna.substring(start,end))!=""){
            System.out.println(findGene(dna.substring(start,end)));
            start=dna.indexOf(findGene(dna.substring(start,end)))+(findGene(dna.substring(start,end))).length();
            counter++;
        }
        System.out.print("There are " + counter + " genes present ! \n");
    }
    public void main(){
        String dna="------ATG---_TAA--TAA------TAA___TAA---TAAATG123456789-----TAA----TAA12ATG3TAA--TGA123ATGTGA--TAA";
        printAllGenes(dna);
    }
    public void findAbc(String input) {
    int index = input.indexOf("abc");
    while (true) {
        if (index == -1) {
            break;
        }
        System.out.print((index+1)+" "+(index+4));
        System.out.println("a"+index+"a");
        String found = input.substring(index+1, index+4);
        System.out.println(found);

        System.out.println("index " + index);
        index = input.indexOf("abc", index+3);
        System.out.println("index after updating " + index);
    }
}
public void test() {
    //findAbc("abcd");
    findAbc("abcbabccabcd");
}
}
