package Utils;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class ExcelReader {
//NF12 chnage
	public static List<Map<String, String>> getExcelData(String filePath, String sheetName) {
	    List<Map<String, String>> data = new ArrayList<>();
//JGCHDUHCI
	    try (FileInputStream fis = new FileInputStream(new File(filePath));
	         Workbook workbook = WorkbookFactory.create(fis)) {

	        Sheet sheet = workbook.getSheet(sheetName);
	        Row headerRow = sheet.getRow(0);
	        int rowCount = sheet.getPhysicalNumberOfRows();

	        for (int i = 1; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            if (row == null) continue;

	            Map<String, String> rowMap = new LinkedHashMap<>();

	            for (int j = 0; j < row.getLastCellNum(); j++) {
	                Cell keyCell = headerRow.getCell(j);
	                Cell valueCell = row.getCell(j);

	                String key = keyCell != null ? keyCell.toString().trim() : "Column" + j;
	                String value = valueCell != null ? valueCell.toString().trim() : "";

	                rowMap.put(key, value);
	            }

	            data.add(rowMap);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return data;
	}

}
