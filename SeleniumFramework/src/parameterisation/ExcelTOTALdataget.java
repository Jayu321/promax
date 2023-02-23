package parameterisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTOTALdataget {public static void main(String[] args) throws IOException {
	
	//excel->workbook->sheets->rows->cell
	
	
	File src=new File("C:\\Users\\Admin\\Documents\\amazonlogin.xlsx\\");
	System.out.println("excel file located");
	
	FileInputStream file=new FileInputStream(src);
	
	XSSFWorkbook book=new XSSFWorkbook(file);
	System.out.println("workbook is open");
	
	//for .xls file we use
	//hssfworkbook
	
	XSSFSheet sheet=book.getSheet("amazonlogin");
	
	/*XSSFRow row= sheet.getRow(0);
	int cellcount=row.getLastCellNum();
	System.out.println(cellcount);
	int rowcount= sheet.getLastRowNum();
	System.out.println(rowcount);*/
	
    int totalrow=sheet.getLastRowNum();
    int totalcell=sheet.getRow(0).getLastCellNum();
    
    for(int i=0; i<=totalrow; i++)
    {
    	XSSFRow row=sheet.getRow(i);
    	for(int j=0; j<totalcell; j++)
    	{
    		XSSFCell cell=row.getCell(j);
    		switch(cell.getCellType())
    		{
    		case STRING:
    			System.out.print(cell.getStringCellValue()+","); break;
    		case NUMERIC:
    			System.out.print(cell.getNumericCellValue()+",");break;
    		case BOOLEAN:
    			System.out.print(cell.getBooleanCellValue()+",");break;
    		}
    		//System.out.println("|");
    	}
    	System.out.println();
    }
	book.close();
	
	
}

}
