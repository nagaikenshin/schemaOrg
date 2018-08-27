package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROPERTY_ID;
import org.kyojo.schemaorg.m3n4.core.Container.PropertyID;

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
