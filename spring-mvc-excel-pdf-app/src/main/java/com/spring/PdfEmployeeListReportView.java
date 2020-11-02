package com.spring;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
public class PdfEmployeeListReportView extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		response.setHeader("Content-Disposition", "attachment; filename=\"emp_list.pdf\"");

		@SuppressWarnings("unchecked")
		List<Employee> employees = (List<Employee>) model.get("empList");
		
		PdfPTable table = new PdfPTable(3);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		table.addCell("Id");
		table.addCell("Emp Name");
		table.addCell("Emp Salary");

		for (Employee employee : employees) {
			table.addCell(String.valueOf(employee.getId()));
			table.addCell(employee.getName());
			table.addCell(String.valueOf(employee.getSalary()));
		}
		document.add(table);
	}
}