package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.TOURIST_TRIP;
import org.kyojo.schemaorg.m3n5.pending.Clazz.TouristTrip;

@ExternalDomain
public class TouristTripConverter implements DomainConverter<TouristTrip, String> {

	@Override
	public String fromDomainToValue(TouristTrip domain) {
		return domain.getNativeValue();
	}

	@Override
	public TouristTrip fromValueToDomain(String value) {
		return new TOURIST_TRIP(value);
	}

}
