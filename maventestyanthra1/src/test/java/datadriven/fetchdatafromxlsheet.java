package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdatafromxlsheet {
	public static void main(String[] args) throws Exception {
		//DataFormatter df=new DataFormatter();
		FileInputStream fis=new FileInputStream("./fetchdataxlsheet.Xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("sheet1");
		Row r = s.getRow(3);
		Cell c = r.getCell(3);
		String value = c.getStringCellValue();
		System.out.println(value);
			}
		
		
		


	}


