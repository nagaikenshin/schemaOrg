package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TO_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Container.ToLocation;

@ExternalDomain
public class ToLocationConverter implements DomainConverter<ToLocation, String> {

	@Override
	public String fromDomainToValue(ToLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public ToLocation fromValueToDomain(String value) {
		return new TO_LOCATION(value);
	}

}
