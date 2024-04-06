package com.rensquare.finance.BillingSoftware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rensquare.finance.BillingSoftware.entity.Invoice;
import com.rensquare.finance.BillingSoftware.repository.InvoiceRepository;

@Service
public class InvoiceService {


    @Autowired
    InvoiceRepository invoiceRepository;
    

    public Iterable<Invoice> getAllInvoices() {
    	return invoiceRepository.findAll();
    }


	public Invoice createInvoice(Invoice invoice) {
		
		invoice.setCustomerAddress(invoice.getCustomerAddress());
		invoice.setCustomerEmail(invoice.getCustomerEmail());
		invoice.setCustomerName(invoice.getCustomerName());
		invoice.setCustomerNumber(invoice.getCustomerNumber());
		invoice.setInvoiceNumber(invoice.getInvoiceNumber());
		invoice.setItems(invoice.getItems());
		invoice.setTax(invoice.getTax());
		invoice.setTotalAmount(invoice.getTotalAmount());
		
		return invoiceRepository.save(invoice);
	}

}