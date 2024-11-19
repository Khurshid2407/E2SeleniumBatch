package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return 
	 * @throws Exception
	 */

	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		return value;
		
	}
	
	/**
	 * 
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellIndex
	 * @throws Exception
	 */
	
	public void getMultipleDataFromExcel(String sheetName, int startRowIndex, int startCellIndex) throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		System.out.println(sh.getLastRowNum());
		DataFormatter df=new DataFormatter();
		for(int i=startRowIndex;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=startCellIndex;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				System.out.println(value);
			}
		}
	}
	
	/**
	 * 
	 * @param sheetName
	 * @param RowIndex
	 * @param CellIndex
	 * @param value
	 * @throws Exception
	 */
	
		public void WriteDataToExcel(String sheetName, int RowIndex, int CellIndex, String value ) throws Exception 
		{
			FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			//sh.createRow(3).createCell(1).setCellValue("Kd");
			sh.getRow(RowIndex).createCell(CellIndex).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(IPathConstant.excelPath);
			wb.write(fos);
		}

	
}
