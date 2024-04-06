package com.rensquare.finance.BillingSoftware.repository;

import org.springframework.data.repository.CrudRepository;

import com.rensquare.finance.BillingSoftware.entity.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice,Long>{

}
