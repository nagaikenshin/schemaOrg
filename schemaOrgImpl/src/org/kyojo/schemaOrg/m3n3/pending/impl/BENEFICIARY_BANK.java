package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BankOrCreditUnion;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.pending.Container;

public class BENEFICIARY_BANK implements Container.BeneficiaryBank {

	private static final long serialVersionUID = 1L;

	public List<BankOrCreditUnion> bankOrCreditUnionList;
	public List<Text> textList;

	public BENEFICIARY_BANK() {
	}

	public BENEFICIARY_BANK(BankOrCreditUnion bankOrCreditUnion) {
		bankOrCreditUnionList = new ArrayList<BankOrCreditUnion>();
		bankOrCreditUnionList.add(bankOrCreditUnion);
	}

	@Override
	public BankOrCreditUnion getBankOrCreditUnion() {
		if(bankOrCreditUnionList != null && bankOrCreditUnionList.size() > 0) {
			return bankOrCreditUnionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion) {
		if(bankOrCreditUnionList == null) {
			bankOrCreditUnionList = new ArrayList<>();
		}
		if(bankOrCreditUnionList.size() == 0) {
			bankOrCreditUnionList.add(bankOrCreditUnion);
		} else {
			bankOrCreditUnionList.set(0, bankOrCreditUnion);
		}
	}

	@Override
	public List<BankOrCreditUnion> getBankOrCreditUnionList() {
		return bankOrCreditUnionList;
	}

	@Override
	public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList) {
		this.bankOrCreditUnionList = bankOrCreditUnionList;
	}

	@Override
	public boolean hasBankOrCreditUnion() {
		return bankOrCreditUnionList != null && bankOrCreditUnionList.size() > 0 && bankOrCreditUnionList.get(0) != null;
	}

	public BENEFICIARY_BANK(String string) {
		this(new TEXT(string));
	}

	public BENEFICIARY_BANK(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public BENEFICIARY_BANK(List<BankOrCreditUnion> bankOrCreditUnionList,
			List<Text> textList) {
		setBankOrCreditUnionList(bankOrCreditUnionList);
		setTextList(textList);
	}

	public void copy(Container.BeneficiaryBank org) {
		setBankOrCreditUnionList(org.getBankOrCreditUnionList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
