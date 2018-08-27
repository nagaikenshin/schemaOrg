package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DROPOFF_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.DropoffLocation;

@ExternalDomain
public class DropoffLocationConverter implements DomainConverter<DropoffLocation, String> {

	@Override
	public String fromDomainToValue(DropoffLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public DropoffLocation fromValueToDomain(String value) {
		return new DROPOFF_LOCATION(value);
	}

}
