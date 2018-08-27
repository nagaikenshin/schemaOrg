package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.StructuredValue;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class VALUE_REFERENCE implements Container.ValueReference {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Enumeration> enumerationList;
	@Transient
	public List<PropertyValue> propertyValueList;
	@Transient
	public List<QualitativeValue> qualitativeValueList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;
	@Transient
	public List<StructuredValue> structuredValueList;

	public VALUE_REFERENCE() {
	}

	public VALUE_REFERENCE(String string) {
		this(new ENUMERATION(string));
	}

	public String getString() {
		if(enumerationList == null || enumerationList.size() == 0 || enumerationList.get(0) == null) {
			return null;
		} else {
			Name name = enumerationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(enumerationList == null) {
			enumerationList = new ArrayList<Enumeration>();
		}
		if(enumerationList.size() == 0) {
			enumerationList.add(new ENUMERATION(string));
		} else {
			enumerationList.set(0, new ENUMERATION(string));
		}
	}

	public VALUE_REFERENCE(Enumeration enumeration) {
		enumerationList = new ArrayList<Enumeration>();
		enumerationList.add(enumeration);
	}

	@Override
	public Enumeration getEnumeration() {
		if(enumerationList != null && enumerationList.size() > 0) {
			return enumerationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEnumeration(Enumeration enumeration) {
		if(enumerationList == null) {
			enumerationList = new ArrayList<>();
		}
		if(enumerationList.size() == 0) {
			enumerationList.add(enumeration);
		} else {
			enumerationList.set(0, enumeration);
		}
	}

	@Override
	public List<Enumeration> getEnumerationList() {
		return enumerationList;
	}

	@Override
	public void setEnumerationList(List<Enumeration> enumerationList) {
		this.enumerationList = enumerationList;
	}

	@Override
	public boolean hasEnumeration() {
		return enumerationList != null && enumerationList.size() > 0 && enumerationList.get(0) != null;
	}

	public VALUE_REFERENCE(PropertyValue propertyValue) {
		propertyValueList = new ArrayList<PropertyValue>();
		propertyValueList.add(propertyValue);
	}

	@Override
	public PropertyValue getPropertyValue() {
		if(propertyValueList != null && propertyValueList.size() > 0) {
			return propertyValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPropertyValue(PropertyValue propertyValue) {
		if(propertyValueList == null) {
			propertyValueList = new ArrayList<>();
		}
		if(propertyValueList.size() == 0) {
			propertyValueList.add(propertyValue);
		} else {
			propertyValueList.set(0, propertyValue);
		}
	}

	@Override
	public List<PropertyValue> getPropertyValueList() {
		return propertyValueList;
	}

	@Override
	public void setPropertyValueList(List<PropertyValue> propertyValueList) {
		this.propertyValueList = propertyValueList;
	}

	@Override
	public boolean hasPropertyValue() {
		return propertyValueList != null && propertyValueList.size() > 0 && propertyValueList.get(0) != null;
	}

	public VALUE_REFERENCE(QualitativeValue qualitativeValue) {
		qualitativeValueList = new ArrayList<QualitativeValue>();
		qualitativeValueList.add(qualitativeValue);
	}

	@Override
	public QualitativeValue getQualitativeValue() {
		if(qualitativeValueList != null && qualitativeValueList.size() > 0) {
			return qualitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQualitativeValue(QualitativeValue qualitativeValue) {
		if(qualitativeValueList == null) {
			qualitativeValueList = new ArrayList<>();
		}
		if(qualitativeValueList.size() == 0) {
			qualitativeValueList.add(qualitativeValue);
		} else {
			qualitativeValueList.set(0, qualitativeValue);
		}
	}

	@Override
	public List<QualitativeValue> getQualitativeValueList() {
		return qualitativeValueList;
	}

	@Override
	public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList) {
		this.qualitativeValueList = qualitativeValueList;
	}

	@Override
	public boolean hasQualitativeValue() {
		return qualitativeValueList != null && qualitativeValueList.size() > 0 && qualitativeValueList.get(0) != null;
	}

	public VALUE_REFERENCE(QuantitativeValue quantitativeValue) {
		quantitativeValueList = new ArrayList<QuantitativeValue>();
		quantitativeValueList.add(quantitativeValue);
	}

	@Override
	public QuantitativeValue getQuantitativeValue() {
		if(quantitativeValueList != null && quantitativeValueList.size() > 0) {
			return quantitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantitativeValue(QuantitativeValue quantitativeValue) {
		if(quantitativeValueList == null) {
			quantitativeValueList = new ArrayList<>();
		}
		if(quantitativeValueList.size() == 0) {
			quantitativeValueList.add(quantitativeValue);
		} else {
			quantitativeValueList.set(0, quantitativeValue);
		}
	}

	@Override
	public List<QuantitativeValue> getQuantitativeValueList() {
		return quantitativeValueList;
	}

	@Override
	public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList) {
		this.quantitativeValueList = quantitativeValueList;
	}

	@Override
	public boolean hasQuantitativeValue() {
		return quantitativeValueList != null && quantitativeValueList.size() > 0 && quantitativeValueList.get(0) != null;
	}

	public VALUE_REFERENCE(StructuredValue structuredValue) {
		structuredValueList = new ArrayList<StructuredValue>();
		structuredValueList.add(structuredValue);
	}

	@Override
	public StructuredValue getStructuredValue() {
		if(structuredValueList != null && structuredValueList.size() > 0) {
			return structuredValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setStructuredValue(StructuredValue structuredValue) {
		if(structuredValueList == null) {
			structuredValueList = new ArrayList<>();
		}
		if(structuredValueList.size() == 0) {
			structuredValueList.add(structuredValue);
		} else {
			structuredValueList.set(0, structuredValue);
		}
	}

	@Override
	public List<StructuredValue> getStructuredValueList() {
		return structuredValueList;
	}

	@Override
	public void setStructuredValueList(List<StructuredValue> structuredValueList) {
		this.structuredValueList = structuredValueList;
	}

	@Override
	public boolean hasStructuredValue() {
		return structuredValueList != null && structuredValueList.size() > 0 && structuredValueList.get(0) != null;
	}

	public VALUE_REFERENCE(List<Enumeration> enumerationList,
			List<PropertyValue> propertyValueList,
			List<QualitativeValue> qualitativeValueList,
			List<QuantitativeValue> quantitativeValueList,
			List<StructuredValue> structuredValueList) {
		setEnumerationList(enumerationList);
		setPropertyValueList(propertyValueList);
		setQualitativeValueList(qualitativeValueList);
		setQuantitativeValueList(quantitativeValueList);
		setStructuredValueList(structuredValueList);
	}

	public void copy(Container.ValueReference org) {
		setEnumerationList(org.getEnumerationList());
		setPropertyValueList(org.getPropertyValueList());
		setQualitativeValueList(org.getQualitativeValueList());
		setQuantitativeValueList(org.getQuantitativeValueList());
		setStructuredValueList(org.getStructuredValueList());
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
