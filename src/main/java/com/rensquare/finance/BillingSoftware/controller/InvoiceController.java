package com.rensquare.finance.BillingSoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rensquare.finance.BillingSoftware.entity.Invoice;
import com.rensquare.finance.BillingSoftware.repository.InvoiceRepository;
import com.rensquare.finance.BillingSoftware.service.InvoiceService;



@RequestMapping("/invoice")
@Controller
public class InvoiceController {

	@Autowired
    InvoiceService invoiceService;
	
	@Autowired
	InvoiceRepository invoiceRepository;


    @GetMapping("/invoices")
    public  String products(Model model) {
        Iterable<Invoice> invoiceList = invoiceService.getAllInvoices();
        model.addAttribute("invoices", invoiceList);
        return "invoices";
    }
    
//   
//    @PostMapping("/createInvoice")
//    public Invoice createInvoice(@RequestBody Invoice invoice) {
//        return invoiceService.createInvoice(invoice);
//    }
//    
//    
    @GetMapping("/invoiceHome")
    public String invoiceHome(){
        return "createInvoice"; 
    }
}
      