
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
        int testSimpleGene(){
        String test1="SNUIDGJKNSFDGSDATGDJIGOSKDLGNDSJKTAAFSDKGL";
        String test2="FDSOGNLSDNGOLATGGNSDJOGLSDGODKSL";
        String test3="FDNSOGLKSDGLATGDKTAA";
        String test4="GD-SJNKGSD-ATGD-KFLGJEOTNEOTAANGKD-GNJSD-G";
        System.out.println("Getting Results!\n");
        System.out.println(" 1 :"+NoOfOccurances(test1,"ATG"));
        System.out.println(" 2 :"+NoOfOccurances(test2,"ATG"));
        System.out.println(" 3 :"+NoOfOccurances(test3,"B"));
        System.out.println(" 4 :"+LastPart("D",test4));
        return 1;
    }
    int NoOfOccurances(String DNA,String search){
        int counter=0;
        int pos=0;
        while(DNA.indexOf(search,pos)!=-1){
            pos=DNA.indexOf(search,pos)+search.length();
            counter++;
        }
        return counter;
    }
    boolean TwoOccurances(String DNA,String search){
        return (NoOfOccurances(DNA,search)>=2);
    }
    String LastPart(String stringa,String stringb){
        int pos=stringb.indexOf(stringa);
        //System.out.print(pos+"   "+stringb.length());
        if(pos==-1)
            return stringb;
            int length=stringb.length();
        return stringb.substring(pos,length);
    }
}
