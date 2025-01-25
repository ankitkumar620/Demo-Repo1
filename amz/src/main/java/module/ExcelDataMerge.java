package module;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
public class ExcelDataMerge {

	static HSSFWorkbook wb;
	static File file;
	static HSSFSheet sheet;
	public static final String Scenario_FILE= System.getProperty("user.dir")+"\\Data.xls";
	public static final String Scenario_SHEET="caseCreation";
	
	/*String CaseType=data.get("caseKey").toString();
	 * Map<String,Object> caseData=new HashMap<String, Object>();
	cseData=excelData.GetKeyRowData(Scenario_FILE,Scenario_Sheet,caseType);
	*/
	public Map<String,Object>GetKeyRowData(String fileName, String sheetname, String dataRow) throws Exception
	{
		file=new File(fileName);
		FileInputStream fis= new FileInputStream(file);
		wb= new HSSFWorkbook(fis);
		int rowNum=getRowNum(sheetname,dataRow);
		Map<String,Object>datamap=new HashMap<String, Object>();
		datamap.putAll(getSheetData(rowNum));
		fis.close();
		return datamap;
	}
	
	public static Map<String, Object>getSheetData(int rowNum) throws Exception
	{
		//FormulaEvalutor objFormulaEvalutor = new HSSFFormulaEvalutor((HSSFWorkbook)wb);
		DataFormatter objDefaultFormat = new DataFormatter();
		int lastCellNum= sheet.getRow(0).getLastCellNum();
		Map<String,Object> datamap=new HashMap<String, Object>();
		for(int j=1;j<lastCellNum;j++)
		{
			HSSFCell cell=null;
			cell=sheet.getRow(rowNum).getCell(j);
			//objFormulaEvalutor.evaluate(cell);
			//String cellValueStr=objDefaultFormat.formatCellValue(cell,objFormulaEvalutor);
			//datamap.put(sheet.getRow(0).getCell(j).toString(), cellValueStr);
			
		} return datamap;
		
	}
	
	
	public static int getRowNum(String sheetname,String dataRow)
	{
		sheet= wb.getSheet(sheetname);
		int rowCount=sheet.getLastRowNum();
		int rowNum=0;
		for(int i=1;i<=rowCount;i++)
		{
			if(sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(dataRow))
			{
				rowNum =i;
				break;
			}
		}
		return rowNum;
	}
}
