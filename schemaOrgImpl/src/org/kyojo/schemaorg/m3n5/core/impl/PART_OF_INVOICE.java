package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Invoice;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class PART_OF_INVOICE implements Container.PartOfInvoice {

	private static final long serialVersionUID = 1L;

	public List<Invoice> invoiceList;

	public PART_OF_INVOICE() {
	}

	public PART_OF_INVOICE(String string) {
		this(new INVOICE(string));
	}

	public String getString() {
		if(invoiceList == null || invoiceList.size() == 0 || invoiceList.get(0) == null) {
			return null;
		} else {
			Name name = invoiceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(invoiceList == null) {
			invoiceList = new ArrayList<Invoice>();
		}
		if(invoiceList.size() == 0) {
			invoiceList.add(new INVOICE(string));
		} else {
			invoiceList.set(0, new INVOICE(string));
		}
	}

	public PART_OF_INVOICE(Invoice invoice) {
		invoiceList = new ArrayList<Invoice>();
		invoiceList.add(invoice);
	}

	@Override
	public Invoice getInvoice() {
		if(invoiceList != null && invoiceList.size() > 0) {
			return invoiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInvoice(Invoice invoice) {
		if(invoiceList == null) {
			invoiceList = new ArrayList<>();
		}
		if(invoiceList.size() == 0) {
			invoiceList.add(invoice);
		} else {
			invoiceList.set(0, invoice);
		}
	}

	@Override
	public List<Invoice> getInvoiceList() {
		return invoiceList;
	}

	@Override
	public void setInvoiceList(List<Invoice> invoiceList) {
		this.invoiceList = invoiceList;
	}

	@Override
	public boolean hasInvoice() {
		return invoiceList != null && invoiceList.size() > 0 && invoiceList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
