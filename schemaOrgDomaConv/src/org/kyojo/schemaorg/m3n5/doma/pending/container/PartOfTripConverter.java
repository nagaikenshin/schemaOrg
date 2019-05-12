package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.PART_OF_TRIP;
import org.kyojo.schemaorg.m3n5.pending.Container.PartOfTrip;

@ExternalDomain
public class PartOfTripConverter implements DomainConverter<PartOfTrip, String> {

	@Override
	public String fromDomainToValue(PartOfTrip domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfTrip fromValueToDomain(String value) {
		return new PART_OF_TRIP(value);
	}

}
