package abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivenframework {

	//public static void main(String[] args) throws IOException {
		/*		// TODO Auto-generated method stub
//		FileInputStream f=new FileInputStream ("C:\\Users\\user\\Desktop\\Book2.xls");
//		 HSSFWorkbook hw=new  HSSFWorkbook (f);
//		 HSSFSheet hs=hw.getSheetAt(0);
//		 System.out.println(hs);
//		HSSFRow row=hs.getRow(0);
//		System.out.println(row);
//int i=hs.getLastRowNum();
//		System.out.println(i);
//	for(int j=0; j<=i; j++)
//	{
//		Row r=hs.getRow(j);
//		Cell c=r.getCell(j);
//		System.out.println(c);
//	}
	
	FileInputStream ip=new FileInputStream("C:\\Users\\user\\Desktop\\Book2.xls");
	Workbook wb=WorkbookFactory.create(ip);
	Sheet sh=wb.getSheetAt(0);
	int i=sh.getLastRowNum();
	for(int j=0; j<=i; j++)
		{
	String value=sh.getRow(j).getCell(2).getStringCellValue();		
	//System.out.println(value);
	FileOutputStream op=new FileOutputStream("C:\\Users\\user\\Desktop\\Book2.xls");	
	sh.getRow(j).createCell(3).setCellValue("caa");
	FileOutputStream op1=new FileOutputStream("C:\\Users\\user\\Desktop\\Book2.xls");	
		wb.write(op1);*/	
		
		
		
		
	public String getExcelData(String value) throws IOException  {
		FileInputStream ip=new FileInputStream("C:\\Users\\user\\Desktop\\Book2.xls");
		XSSFWorkbook wb=new XSSFWorkbook(ip);
		XSSFSheet sh=wb.getSheetAt(0);
		int i=sh.getLastRowNum();
		for(int j=0; j<=i; j++) {
		String data=sh.getRow(j).getCell(i).getStringCellValue();
	return data;
	}
		return value;
	}
		
		
		}
	
	

