package org.kyojo.schemaorg.m3n4.doma.meta.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.meta.impl.PROPERTY;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Property;

@ExternalDomain
public class PropertyConverter implements DomainConverter<Property, String> {

	@Override
	public String fromDomainToValue(Property domain) {
		return domain.getNativeValue();
	}

	@Override
	public Property fromValueToDomain(String value) {
		return new PROPERTY(value);
	}

}
