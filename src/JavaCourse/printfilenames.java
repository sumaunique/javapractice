package JavaCourse;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class printfilenames {

	

	
	    public static void main(String[] args) {
	        String directoryPath = "C:/Users/sumal/eclipse-workspace/JavaCourse/src/JavaCourse"; // Replace with your directory path
	        String excelFilePath = "file_names.xlsx"; // Name of the Excel file
	        
	        // Create a new Excel workbook and sheet
	        try (Workbook workbook = new XSSFWorkbook()) {
	            Sheet sheet = workbook.createSheet("File Names");

	            // Get a list of files in the directory
	            File directory = new File(directoryPath);
	            File[] files = directory.listFiles();

	            if (files != null) {
	                int rowNum = 0;
	                for (File file : files) {
	                    String fileName = file.getName();

	                    // Create a new row and cell, then write the file name
	                    Row row = sheet.createRow(rowNum++);
	                    Cell cell = row.createCell(0);
	                    cell.setCellValue(fileName);
	                }

	                // Write the workbook content to an Excel file
	                try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	                    workbook.write(outputStream);
	                    System.out.println("File names written to Excel file successfully.");
	                }
	            } else {
	                System.out.println("No files found in the directory.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	

