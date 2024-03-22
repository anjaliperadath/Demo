package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSample {

	static FileInputStream f;//FileInputStream is class and f is object
    static XSSFWorkbook w;
    static XSSFSheet sh;
    
    public static String readStringData(int row, int col) throws IOException//incase no input is given to avoid IO exception
    {
    	f=new FileInputStream(C:\\Users\\Sys\\Desktop\\ExcelSheetName.xlsx);//right click on the excel sheet and Ctrl+C or copy path
    	w= new XSSFWorkbook(f);
    	sh= w.getSheet("sheet1");
    	XSSFRow r=sh.getRow(row);
    	XSSFCell c=r.getCell(col);
    	return c.getStringCellValue();
    	
    	
    }
    
}
