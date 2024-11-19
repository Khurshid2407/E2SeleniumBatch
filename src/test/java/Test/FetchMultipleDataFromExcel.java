package Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=new FileInputStream("D:\\Selenium\\Excel\\Test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getFirstRowNum());
		DataFormatter df=new DataFormatter();
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				System.out.println(value);
			}
		}

	}

}
