package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DROPOFF_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.DropoffLocation;

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
