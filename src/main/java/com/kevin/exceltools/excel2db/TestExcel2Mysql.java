package com.kevin.exceltools.excel2db;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2214:36
 */
public class TestExcel2Mysql {
    public static void main(String[] args) throws Exception {

        String file = "C:\\Users\\kevin\\Desktop\\111.xlsx";
        InputStream is = null;
        Workbook workbook = null;

        try {
            is = new FileInputStream(file);
            if (file.endsWith("xlsx")) {
                workbook = new XSSFWorkbook(is);
            } else if (file.endsWith("xls")) {
                workbook = new HSSFWorkbook(is);
            } else {
                throw new Exception("不支持的文件格式");
            }
            Sheet sheet = workbook.getSheetAt(0);
            //System.out.println(sheet.getSheetName());
            int lastRowNum = sheet.getLastRowNum();
            //System.out.println(lastRowNum);
            //获取第一行
            Row row0 = sheet.getRow(0);
            //获取最大列数
            int columns = row0.getPhysicalNumberOfCells();
            //System.out.println(columns);
            Cell cell0 = row0.getCell(0);
            //System.out.println(cell0.getStringCellValue());
            for (int i = 1; i <= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                if (null != row) {
                    for (int j = 0; j <= columns; j++) {

                        String cellData = (String) getCellFormatValue(row.getCell(j));
                        System.out.println(cellData);
                    }

                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null) {
            //判断cell类型
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC: {
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                }
                case Cell.CELL_TYPE_FORMULA: {
                    //判断cell是否为日期格式
                    if (DateUtil.isCellDateFormatted(cell)) {
                        //转换为日期格式YYYY-mm-dd
                        cellValue = cell.getDateCellValue();
                    } else {
                        //数字
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING: {
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = "";
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }
}
