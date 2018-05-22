package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessEntityType;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class ELIGIBLE_CUSTOMER_TYPE implements Container.EligibleCustomerType {

	private static final long serialVersionUID = 1L;

	public List<BusinessEntityType> businessEntityTypeList;

	public ELIGIBLE_CUSTOMER_TYPE() {
	}

	public ELIGIBLE_CUSTOMER_TYPE(String string) {
		this(new BUSINESS_ENTITY_TYPE(string));
	}

	public String getString() {
		if(businessEntityTypeList == null || businessEntityTypeList.size() == 0 || businessEntityTypeList.get(0) == null) {
			return null;
		} else {
			Name name = businessEntityTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(businessEntityTypeList == null) {
			businessEntityTypeList = new ArrayList<BusinessEntityType>();
		}
		if(businessEntityTypeList.size() == 0) {
			businessEntityTypeList.add(new BUSINESS_ENTITY_TYPE(string));
		} else {
			businessEntityTypeList.set(0, new BUSINESS_ENTITY_TYPE(string));
		}
	}

	public ELIGIBLE_CUSTOMER_TYPE(BusinessEntityType businessEntityType) {
		businessEntityTypeList = new ArrayList<BusinessEntityType>();
		businessEntityTypeList.add(businessEntityType);
	}

	@Override
	public BusinessEntityType getBusinessEntityType() {
		if(businessEntityTypeList != null && businessEntityTypeList.size() > 0) {
			return businessEntityTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessEntityType(BusinessEntityType businessEntityType) {
		if(businessEntityTypeList == null) {
			businessEntityTypeList = new ArrayList<>();
		}
		if(businessEntityTypeList.size() == 0) {
			businessEntityTypeList.add(businessEntityType);
		} else {
			businessEntityTypeList.set(0, businessEntityType);
		}
	}

	@Override
	public List<BusinessEntityType> getBusinessEntityTypeList() {
		return businessEntityTypeList;
	}

	@Override
	public void setBusinessEntityTypeList(List<BusinessEntityType> businessEntityTypeList) {
		this.businessEntityTypeList = businessEntityTypeList;
	}

	@Override
	public boolean hasBusinessEntityType() {
		return businessEntityTypeList != null && businessEntityTypeList.size() > 0 && businessEntityTypeList.get(0) != null;
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
