import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class execelread 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("./excel/excel1.xlsx");
        Workbook book = WorkbookFactory.create(file);
        Sheet sheet = book.getSheet("sheet1");
       /* Row row = sheet.getRow(2);
        Cell cell = row.getCell(3);
        String string = cell.toString();
        System.out.println(string);*/
        
        //multiple data from exvel sheet
        for (int i =2; i <sheet.getLastRowNum(); i++)
        {
			Row row1 = sheet.getRow(i);
			for (int j =3; j <row1.getLastCellNum(); j++) 
			{
				Cell cell1 = row1.getCell(j);
				String string1 = cell1.toString();
				System.out.println(string1);
				
			}
			
		}
		
	}

}
