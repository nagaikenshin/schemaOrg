package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROPERTY_ID;
import org.kyojo.schemaOrg.m3n3.core.Container.PropertyID;

@ExternalDomain
public class PropertyIDConverter implements DomainConverter<PropertyID, String> {

	@Override
	public String fromDomainToValue(PropertyID domain) {
		return domain.getNativeValue();
	}

	@Override
	public PropertyID fromValueToDomain(String value) {
		return new PROPERTY_ID(value);
	}

}
