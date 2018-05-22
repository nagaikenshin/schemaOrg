package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROPERTY_VALUE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValueSpecification;

@ExternalDomain
public class PropertyValueSpecificationConverter implements DomainConverter<PropertyValueSpecification, String> {

	@Override
	public String fromDomainToValue(PropertyValueSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public PropertyValueSpecification fromValueToDomain(String value) {
		return new PROPERTY_VALUE_SPECIFICATION(value);
	}

}
