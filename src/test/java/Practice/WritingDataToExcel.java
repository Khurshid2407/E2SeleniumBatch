package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Excel\\Animals.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Names");
		//sh.createRow(3).createCell(1).setCellValue("Kd");
		sh.getRow(3).createCell(0).setCellValue("Suraj");
		FileOutputStream fos=new FileOutputStream("D:\\Selenium\\Excel\\Animals.xlsx");
		wb.write(fos);

	}

}
