package Jtp.Pojo.Demo;

//Creating Lines POJO class
public class Lines{  
    private String recordType;  
    private int lineNumber;  
    private String refDocNum;
    private String city;
    private float amount;    
    //Creating getters and setters
    public void setrecordType(String name) {  
        this.recordType = name;  
    }   
    public void setlineNumber(int line) {  
        this.lineNumber = line;  
    }   
    public void setrefDocNum(String refDocNum) {  
        this.refDocNum = refDocNum;  
    }
    public void setcity(String city) {  
        this.city = city;  
    } 
    public void setamount(float amount) {  
        this.amount = amount;  
    }
    public String getRecordType() {
        return recordType;
    }
    public int getLineNumber() {
        return lineNumber;
    }
    public String getRefDocNum() {
        return refDocNum;
    }
    public String getCity() {
        return city;
    }
    public float getAmount() {
        return amount;
    }
    //Generating tostring for the variables.
    @Override
    public String toString() {
        return "[recordType=" + recordType + ", lineNumber=" + lineNumber + ", refDocNum=" + refDocNum + ", city="
                + city + ", amount=" + amount + "]";
        }
}