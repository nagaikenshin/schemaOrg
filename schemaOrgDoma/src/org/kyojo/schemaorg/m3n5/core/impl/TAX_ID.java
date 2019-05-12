package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;

import org.seasar.doma.Transient;

public class TAX_ID implements Container.TaxID {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<LocationFeatureSpecification> locationFeatureSpecificationList;
	@Transient
	public List<PropertyValue> propertyValueList;
	@Transient
	public List<Text> textList;
	@Transient
	public List<URL> urlList;

	public TAX_ID() {
	}

	public TAX_ID(LocationFeatureSpecification locationFeatureSpecification) {
		locationFeatureSpecificationList = new ArrayList<LocationFeatureSpecification>();
		locationFeatureSpecificationList.add(locationFeatureSpecification);
	}

	@Override
	public LocationFeatureSpecification getLocationFeatureSpecification() {
		if(locationFeatureSpecificationList != null && locationFeatureSpecificationList.size() > 0) {
			return locationFeatureSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLocationFeatureSpecification(LocationFeatureSpecification locationFeatureSpecification) {
		if(locationFeatureSpecificationList == null) {
			locationFeatureSpecificationList = new ArrayList<>();
		}
		if(locationFeatureSpecificationList.size() == 0) {
			locationFeatureSpecificationList.add(locationFeatureSpecification);
		} else {
			locationFeatureSpecificationList.set(0, locationFeatureSpecification);
		}
	}

	@Override
	public List<LocationFeatureSpecification> getLocationFeatureSpecificationList() {
		return locationFeatureSpecificationList;
	}

	@Override
	public void setLocationFeatureSpecificationList(List<LocationFeatureSpecification> locationFeatureSpecificationList) {
		this.locationFeatureSpecificationList = locationFeatureSpecificationList;
	}

	@Override
	public boolean hasLocationFeatureSpecification() {
		return locationFeatureSpecificationList != null && locationFeatureSpecificationList.size() > 0 && locationFeatureSpecificationList.get(0) != null;
	}

	public TAX_ID(PropertyValue propertyValue) {
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

	public TAX_ID(String string) {
		this(new TEXT(string));
	}

	public TAX_ID(Text text) {
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

	public TAX_ID(URL url) {
		urlList = new ArrayList<URL>();
		urlList.add(url);
	}

	@Override
	public URL getURL() {
		if(urlList != null && urlList.size() > 0) {
			return urlList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setURL(URL url) {
		if(urlList == null) {
			urlList = new ArrayList<>();
		}
		if(urlList.size() == 0) {
			urlList.add(url);
		} else {
			urlList.set(0, url);
		}
	}

	@Override
	public List<URL> getURLList() {
		return urlList;
	}

	@Override
	public void setURLList(List<URL> urlList) {
		this.urlList = urlList;
	}

	@Override
	public boolean hasURL() {
		return urlList != null && urlList.size() > 0 && urlList.get(0) != null;
	}

	public TAX_ID(List<LocationFeatureSpecification> locationFeatureSpecificationList,
			List<PropertyValue> propertyValueList,
			List<Text> textList,
			List<URL> urlList) {
		setLocationFeatureSpecificationList(locationFeatureSpecificationList);
		setPropertyValueList(propertyValueList);
		setTextList(textList);
		setURLList(urlList);
	}

	public void copy(Container.TaxID org) {
		setLocationFeatureSpecificationList(org.getLocationFeatureSpecificationList());
		setPropertyValueList(org.getPropertyValueList());
		setTextList(org.getTextList());
		setURLList(org.getURLList());
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
