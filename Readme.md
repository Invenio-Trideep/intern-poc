Intern-POC-1


Problem Statement-

Write a Java program that meets the following requirements:

1. Read the attached csv file, which includes multiple lines and a header.
Header line contains the fields HAUDIT;6;170.00;10;2022-11-28 (recordType;totalLines; totalAmt;minAmt;currentDate) and Line item contains the fields LINE;001;REF00124;NewYork;25.00 (recordType;lineNumber;refDocNum;city;amount)

2. Create the pojo classes for the header and lines with the following variable names:
Header fields: recordType, totalLines, totalAmt, minAmt, currentDate      
Line fields: recordType, lineNumber, refDocNum, city, amount

3. Each line of the csv file should be read and split using the ";" delimiter and set the values accordingly in the header and lines pojo. The line starting with HAUDIT is the header, and the line starting with LINE is the line item.

4. Maintain the lineitems pojo in the list since we have multiple lines(list of lineitem pojo)

5. Create a HashMap with refDocNum as a key and list of lineitem pojo as a value containing refDocNum related information.

6. Created header, HashMap data should be printed.

Exception handling:
For the following cases, throw an error message with the error description:
1. If the totalLines value in the header does not match the total number of line items. 
2. In case the totalAmt value in the header is not equal to the sum of each line's amount. 
3. In the header, if the currentDate is not formatted as yyyy-MM-dd.
4. In header and line item fields, there are five fields expected, so throw an error if there are fewer or more fields.

Expected sample output:
Header: Header [recordType=HAUDIT, totalLines=6, totalAmt=170.00, minAmt=10, currentDate=2022-11-28]

HashMap: {REF00124=[LineItems [recordType=LINE, lineNumber=001, refDocNum=REF00124, city=NewYork, amount=25.00], LineItems [recordType=LINE, lineNumber=002, refDocNum=REF00124, city=California, amount=25.00]], REF00125=[LineItems [recordType=LINE, lineNumber=001, refDocNum=REF00125, city=NewYork, amount=55.00], LineItems [recordType=LINE, lineNumber=002, refDocNum=REF00125, city=California, amount=25.00]], REF00126=[LineItems [recordType=LINE, lineNumber=001, refDocNum=REF00126, city=NewYork, amount=10.00], LineItems [recordType=LINE, lineNumber=002, refDocNum=REF00126, city=California, amount=30.00]]}


