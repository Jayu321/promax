package parameterisation;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class AddDataExcel {public static void main(String[] args) throws IOException {
	
	
	HSSFWorkbook book =new HSSFWorkbook();
	HSSFSheet sheet = book.createSheet();
	
	sheet.createRow(0);
	
	sheet.getRow(0).createCell(0).setCellValue("jayesh");
	
	sheet.getRow(0).createCell(1).setCellValue("sonawane");
	
	sheet.createRow(1);
	
    sheet.getRow(1).createCell(0).setCellValue("nik");
	
	sheet.getRow(1).createCell(1).setCellValue("patil");
	
	sheet.getRow(1).createCell(2).setCellValue("wadkar");
	
	
	
    sheet.createRow(2);
	
    sheet.getRow(2).createCell(0).setCellValue("bhavesh");
	
	sheet.getRow(2).createCell(1).setCellValue("patil");
	
	File file =new File("C:\\Users\\Admin\\Documents\\Custom Office Templates\\jayu.xls");
	
	book.write(file);
	
	book.close();
	
}

}
