package Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchSingleDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Excel\\Test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Cell s=wb.getSheet("Sheet1").getRow(1).getCell(0);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(s);
		System.out.println(value);
		
		
		

	}

}
