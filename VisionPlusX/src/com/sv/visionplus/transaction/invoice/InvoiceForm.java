/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.invoice.model.TInvoice;

/**
 *
 * @author Mohan
 */
public class InvoiceForm extends AbstractTransactionForm<TInvoice> {

    @Override
    protected AbstractTransactionFormService<TInvoice> getTransactionFormService() {
        return new InvoiceService();
    }

    @Override
    protected AbstractObjectCreator<TInvoice> getObjectCreator() {
        return new PCInvoice(this);
    }

}