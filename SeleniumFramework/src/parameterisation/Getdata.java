package parameterisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getdata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File src=new File("C:\\Users\\Admin\\Documents\\amazonlogin.xlsx\\");
		
		FileInputStream file=new FileInputStream(src);
		
		String cellnum=WorkbookFactory.create(file).getSheet("amazonlogin").getRow(1).getCell(1).getStringCellValue();
		System.out.println(cellnum);
	}

}
