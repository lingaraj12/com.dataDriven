package abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data {

	public String getExcelData(String data) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream ip= new FileInputStream("C:\\Users\\user\\Desktop\\Book2.xls");
		HSSFWorkbook book=new HSSFWorkbook(ip);
		HSSFSheet sheet= book.getSheetAt(0);
		int i=sheet.getLastRowNum();
		for(int j=0; j<=i; j++) {
			String data1=sheet.getRow(i).getCell(j).getStringCellValue();
		
		return data1;
		
		
		}
		return data;
			
	
	
		/*public String getExcelData(String value) throws IOException  {
			FileInputStream ip=new FileInputStream("C:\\Users\\user\\Desktop\\testdata.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(ip);
			XSSFSheet sh=wb.getSheetAt(0);
			int i=sh.getLastRowNum();
			for(int j=0; j<=i; j++) {
			String data=sh.getRow(j).getCell(0).getStringCellValue();
		return data;
		}
			return value;*/
		}
	
	
	
	
	
	}


