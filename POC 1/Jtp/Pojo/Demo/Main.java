package Jtp.Pojo.Demo;
import java.io.*;
import java.util.*;  
import java.util.Scanner;


//Creating main class to read CSV
public class Main  
{  
    public static void main(String[] args) throws Exception  
    {  
        Scanner sc = new Scanner(new File("read-file-java-poc1.csv"));
        String delimiter=" ; "; 
        String s; 
        HashMap<String,List<Lines>> hm=new HashMap<String,List<Lines>>();
        // sc.useDelimiter(";");
        while (sc.hasNext())
        {  
            s=sc.next();
            String[] sArr = s.split(";", 0);
            // System.out.println(sArr);
            if (s.startsWith("HAUDIT")){
                Header headerItem = new Header();
                headerItem.setrecordType(sArr[0]);
                headerItem.settotalLines(Integer.parseInt(sArr[1]));
                headerItem.settotalAmt(Float.parseFloat(sArr[2]));
                headerItem.setminAmt(Integer.parseInt(sArr[3]));
                headerItem.setcurrentDate(sArr[4]);
                System.out.println("Header: "+headerItem);
            }

            if (s.startsWith("LINE")){
                Lines linesItem = new Lines();
                linesItem.setrecordType(sArr[0]);
                linesItem.setlineNumber(Integer.parseInt(sArr[1]));
                linesItem.setrefDocNum(sArr[2]);
                linesItem.setcity(sArr[3]);
                linesItem.setamount(Float.parseFloat(sArr[4]));
                if (hm.get(sArr[2])==null) {
                    List<Lines> linesList = new ArrayList<Lines>();
                    linesList.add(linesItem);
                    hm.put(sArr[2],linesList);
                } else {
                    hm.get(sArr[2]).add(linesItem);
                }
            }

        }
        System.out.println("HashMap: "+hm);
        sc.close();
    }
}
