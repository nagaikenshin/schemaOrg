package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.pending.Clazz.RepaymentSpecification;
import org.kyojo.schemaorg.m3n3.pending.Container;
import org.kyojo.schemaorg.m3n3.pending.impl.REPAYMENT_SPECIFICATION;

import org.seasar.doma.Transient;

public class LOAN_REPAYMENT_FORM implements Container.LoanRepaymentForm {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<RepaymentSpecification> repaymentSpecificationList;

	public LOAN_REPAYMENT_FORM() {
	}

	public LOAN_REPAYMENT_FORM(String string) {
		this(new REPAYMENT_SPECIFICATION(string));
	}

	public String getString() {
		if(repaymentSpecificationList == null || repaymentSpecificationList.size() == 0 || repaymentSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = repaymentSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(repaymentSpecificationList == null) {
			repaymentSpecificationList = new ArrayList<RepaymentSpecification>();
		}
		if(repaymentSpecificationList.size() == 0) {
			repaymentSpecificationList.add(new REPAYMENT_SPECIFICATION(string));
		} else {
			repaymentSpecificationList.set(0, new REPAYMENT_SPECIFICATION(string));
		}
	}

	public LOAN_REPAYMENT_FORM(RepaymentSpecification repaymentSpecification) {
		repaymentSpecificationList = new ArrayList<RepaymentSpecification>();
		repaymentSpecificationList.add(repaymentSpecification);
	}

	@Override
	public RepaymentSpecification getRepaymentSpecification() {
		if(repaymentSpecificationList != null && repaymentSpecificationList.size() > 0) {
			return repaymentSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRepaymentSpecification(RepaymentSpecification repaymentSpecification) {
		if(repaymentSpecificationList == null) {
			repaymentSpecificationList = new ArrayList<>();
		}
		if(repaymentSpecificationList.size() == 0) {
			repaymentSpecificationList.add(repaymentSpecification);
		} else {
			repaymentSpecificationList.set(0, repaymentSpecification);
		}
	}

	@Override
	public List<RepaymentSpecification> getRepaymentSpecificationList() {
		return repaymentSpecificationList;
	}

	@Override
	public void setRepaymentSpecificationList(List<RepaymentSpecification> repaymentSpecificationList) {
		this.repaymentSpecificationList = repaymentSpecificationList;
	}

	@Override
	public boolean hasRepaymentSpecification() {
		return repaymentSpecificationList != null && repaymentSpecificationList.size() > 0 && repaymentSpecificationList.get(0) != null;
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
