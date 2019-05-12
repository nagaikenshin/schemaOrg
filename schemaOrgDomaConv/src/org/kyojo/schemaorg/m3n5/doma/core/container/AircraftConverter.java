package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AIRCRAFT;
import org.kyojo.schemaorg.m3n5.core.Container.Aircraft;

@ExternalDomain
public class AircraftConverter implements DomainConverter<Aircraft, String> {

	@Override
	public String fromDomainToValue(Aircraft domain) {
		return domain.getNativeValue();
	}

	@Override
	public Aircraft fromValueToDomain(String value) {
		return new AIRCRAFT(value);
	}

}
