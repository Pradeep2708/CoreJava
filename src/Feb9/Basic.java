package Feb9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\Data.xls");
		
		FileInputStream input=new FileInputStream(file);
		
		HSSFWorkbook workbook =new HSSFWorkbook(input);
		
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row = sheet.getRow(0);
		
		HSSFCell cell = row.getCell(2);
		
		String temp = cell.getStringCellValue();
		
		System.out.println(temp);
		
	
	}

}
