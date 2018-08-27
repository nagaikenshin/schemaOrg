package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.OCCUPATION_LOCATION;
import org.kyojo.schemaorg.m3n4.pending.Container.OccupationLocation;

@ExternalDomain
public class OccupationLocationConverter implements DomainConverter<OccupationLocation, String> {

	@Override
	public String fromDomainToValue(OccupationLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public OccupationLocation fromValueToDomain(String value) {
		return new OCCUPATION_LOCATION(value);
	}

}
