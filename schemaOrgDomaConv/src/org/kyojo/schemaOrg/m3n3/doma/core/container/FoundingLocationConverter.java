package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOUNDING_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.FoundingLocation;

@ExternalDomain
public class FoundingLocationConverter implements DomainConverter<FoundingLocation, String> {

	@Override
	public String fromDomainToValue(FoundingLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public FoundingLocation fromValueToDomain(String value) {
		return new FOUNDING_LOCATION(value);
	}

}
