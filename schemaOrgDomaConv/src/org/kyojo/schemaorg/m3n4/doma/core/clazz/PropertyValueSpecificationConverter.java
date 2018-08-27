package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROPERTY_VALUE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValueSpecification;

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
