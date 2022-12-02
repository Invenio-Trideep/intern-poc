package Jtp.Pojo.Demo;


//Creating Header POJO class
public class Header{  
    private String recordType;  
    private int totalLines;  
    private float totalAmt;
    private int minAmt;
    private String currentDate;  
    //Creating getters and settters  
    public void setrecordType(String name) {  
        this.recordType = name;  
    }   
    public void settotalLines(int lines) {  
        this.totalLines = lines;  
    }   
    public void settotalAmt(float amt) {  
        this.totalAmt = amt;  
    }
    public void setminAmt(int minAmt) {  
        this.minAmt = minAmt;  
    } 
    public void setcurrentDate(String date) {  
        this.currentDate = date;  
    }
    public String getRecordType() {
        return recordType;
    }
    public int getTotalLines() {
        return totalLines;
    }
    public float getTotalAmt() {
        return totalAmt;
    }
    public int getMinAmt() {
        return minAmt;
    }
    public String getCurrentDate() {
        return currentDate;
    }
    //Generating tostring for the variables.
    @Override
    public String toString() {
        return "Header [recordType=" + recordType + ", totalLines=" + totalLines + ", totalAmt=" + totalAmt
                + ", minAmt=" + minAmt + ", currentDate=" + currentDate + "]";
    }  
    
    
}
