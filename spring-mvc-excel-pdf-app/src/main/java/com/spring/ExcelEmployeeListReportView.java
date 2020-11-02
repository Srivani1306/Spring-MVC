package com.spring;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ExcelEmployeeListReportView extends AbstractXlsView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setHeader("Content-disposition", "attachment; filename=\"emp_list.xls\"");

		@SuppressWarnings("unchecked")
		List<Employee> employees = (List<Employee>) model.get("empList");

		Sheet sheet = workbook.createSheet("Emp List");

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.createCell(1).setCellValue("Emp Name");
		header.createCell(2).setCellValue("Emp Salary");

		int rowNum = 1;
		for (Employee employee : employees) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(employee.getId());
			row.createCell(1).setCellValue(employee.getName());
			row.createCell(2).setCellValue(employee.getSalary());
		}
	}
}
