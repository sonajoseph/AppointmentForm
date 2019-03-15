package com.sona.task1.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sona.task1.model.Forms;

public class GeneratePdfReport {

    public static ByteArrayInputStream formReport(List<Forms> forms) {

        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        
        
        Forms letterForm= forms.get(0);
        
        
       
        try
        {
           PdfWriter writer = PdfWriter.getInstance(document, out);
           document.open();

           document.add(new Paragraph( "Dear "+letterForm.getTitle()+" "+letterForm.getFullname()));

           document.add(new Paragraph("After a thorough and comprehensive review, I am pleased to announce that "+letterForm.getCompanyname()+". would like to offer you the position of "+letterForm.getJobtitle()));

   	document.add(new Paragraph( "Your role will begin on "+letterForm.getDateTime()+". You will report every weekday to the "+letterForm.getCompanyname()+" in Cochin, IL, between the hours of 9:00 AM and 5:00 PM, and you will be expected to provide "+letterForm.getCompanyname()+". with 35 hours of work per week. In your role as"+letterForm.getJobtitle()+", you will report to the Director of Finance, Ellen Stevens."));

   document.add(new Paragraph( "The salary for this position will be $57,000 USD per year. This amount will be paid by check or direct deposit in bi-weekly increments of $2,192.30, minus appropriate withholdings."));

   document.add(new Paragraph( "This role will be considered exempt, so you will not be eligible for overtime compensation. As an exempt employee, you will be entitled to standard federal holidays plus 80 hours of paid time-off per year, which may be used at your discretion. You will also be eligible to participate in our employer sponsored health plan. Please review the enclosed Plan Summary for more information."));

   document.add(new Paragraph( "The agreement between you and "+letterForm.getCompanyname()+". will be classified as at-will, which means either party may terminate the agreement at any time, for any reason, with or without notice."));

   document.add(new Paragraph( "All employees of "+letterForm.getCompanyname()+". are expected to abide by the policies outlined in our Employee Handbook, which covers safety rules, conduct and behavior, and our business casual dress code. To find the full text of the Employee Handbook, please visit the company website and click on the tab marked “Handbook, Full Text”."));

   document.add(new Paragraph( "If you choose to accept this position, please sign the enclosed Employee Agreement Form and Procedures Compliance Form and return both to my office by Tuesday, May 30 2019."));

   document.add(new Paragraph( "When you report on your first day, you will be asked to present a state issued photo ID."));

   document.add(new Paragraph( "For more information about this position or about "+letterForm.getCompanyname()+", please contact my office at any time."));

   document.add(new Paragraph( "Sincerely,"));
    

   document.add(new Paragraph( "HR Manager"));
   document.add(new Paragraph( "Anitha s"));

    
     			
     		 
           document.close();
           writer.close();
        } catch (DocumentException e)
        {
           e.printStackTrace();
        } 
        
        
//        try {
//            //data in a table
//            PdfPTable table = new PdfPTable(6);
//            table.setWidthPercentage(100);
//            table.setWidths(new int[]{1, 3, 3,3,3,3});
//
//            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
//
//            PdfPCell hcell;
//            hcell = new PdfPCell(new Phrase("Id", headFont));
//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//
//            hcell = new PdfPCell(new Phrase("First Name", headFont));
//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            
//            hcell = new PdfPCell(new Phrase("Company Name", headFont));
//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            
//            hcell = new PdfPCell(new Phrase("Job Title", headFont));
//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            
//            hcell = new PdfPCell(new Phrase("Address", headFont));
//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            
//            hcell = new PdfPCell(new Phrase("Date", headFont));
//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            
//           
//        
//            
//             
//            for (Forms form  : forms) {
//
//                PdfPCell cell;
//
//                cell = new PdfPCell(new Phrase(form.getId()));
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//                table.addCell(cell);
//
//                cell = new PdfPCell(new Phrase(form.getFirstname()));
////                cell.setPaddingLeft(5);
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
//                table.addCell(cell);
//
//                cell = new PdfPCell(new Phrase(form.getCompanyname()));
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
////                cell.setPaddingRight(5);
//                table.addCell(cell);
//                
//                cell = new PdfPCell(new Phrase(form.getJobtitle()));
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
////                cell.setPaddingRight(5);
//                table.addCell(cell);
//                
//                cell = new PdfPCell(new Phrase(form.getAddress()));
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
////                cell.setPaddingRight(5);
//                table.addCell(cell);
//
//                
//                cell = new PdfPCell(new Phrase(form.getDateTime()));
//                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
////                cell.setPaddingRight(5);
//                table.addCell(cell);
//                
//              
//            }
// //written to bytearrayoutputstream && table is inserted into the pdf document
//           /* PdfWriter.getInstance(document, out);
//            document.open();
//            document.add(table);
//            //In order for the data to be written to the ByteArrayOutputStream, the document must be closed.
//            document.close();*/
//            
//        } catch (DocumentException ex) {
//        
//            Logger.getLogger(GeneratePdfReport.class.getName()).log(Level.SEVERE, null, ex);
//        }
 //data is returne as bytearray input stream.
        return new ByteArrayInputStream(out.toByteArray());
    }
}