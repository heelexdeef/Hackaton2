package com.company;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Controller {
    private Model model;
    private HSSFWorkbook workbook;
    private HSSFSheet sheet;
    private HSSFRow rows[];
    private ArrayList<CarData> carDataArrayList = new ArrayList<>();
    private String array[];

    public void setModel(Model model) {
        this.model = model;
    }

    public String[] getArray() {
        return array;
    }

    public void readTable(String path) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(path));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            workbook = wb;
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println("error");
        }
        sheet = workbook.getSheetAt(0);
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            rows[i] = sheet.getRow(i);
            array = rowToCarData(rows[i]);
        }
    }

    public String[] rowToCarData(HSSFRow row) {
        String arr[] = new String[14];
        for (int i = 0; i < 14; i++) {
        arr[i] = row.getCell(i).getStringCellValue();
        }
        return arr;
    }

    public HSSFRow[] getRows() {
        readTable("carData.xlsx");
        return rows;
    }
}


