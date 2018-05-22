package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROPERTY_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue;

@ExternalDomain
public class PropertyValueConverter implements DomainConverter<PropertyValue, String> {

	@Override
	public String fromDomainToValue(PropertyValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public PropertyValue fromValueToDomain(String value) {
		return new PROPERTY_VALUE(value);
	}

}
