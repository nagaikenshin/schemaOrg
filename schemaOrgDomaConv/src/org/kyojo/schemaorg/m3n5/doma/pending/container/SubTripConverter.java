package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.SUB_TRIP;
import org.kyojo.schemaorg.m3n5.pending.Container.SubTrip;

@ExternalDomain
public class SubTripConverter implements DomainConverter<SubTrip, String> {

	@Override
	public String fromDomainToValue(SubTrip domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubTrip fromValueToDomain(String value) {
		return new SUB_TRIP(value);
	}

}
