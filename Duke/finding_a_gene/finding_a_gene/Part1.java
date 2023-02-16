
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    int testSimpleGene(){
        String test1="SNUIDGJKNSFDGSDATGDJIGOSKDLGNDSJKTAAFSDKGL";
        String test2="FDSOGNLSDNGOLATGGNSDJOGLSDGODKSL";
        String test3="FDNSOGLKSDGLATGDKTAA";
        String test4="GDSJNKGSDATGDKFLGJEOTNEOTAANGKDGNJSDG";
        System.out.println("Getting Results!\n");
        System.out.println(" 1 :"+findSimpleGene(test1));
        System.out.println(" 2 :"+findSimpleGene(test2));
        System.out.println(" 3 :"+findSimpleGene(test3));
        System.out.println(" 4 :"+findSimpleGene(test4));
        return 1;
    }
    String findSimpleGene(String DNA){
        String subDNA="";
        DNA.toUpperCase();
        int start=DNA.indexOf("ATG");
        int end = DNA.indexOf("TAA",start+3);
        
        end+=3;
        if(start==-1 || end==-1){
            return "";
        }
        if((end-start)%3==0){
            System.out.print("Gene Found ! "+start+" to "+end);
            return DNA.substring(start,end);
        }
        return subDNA;
    }

}
