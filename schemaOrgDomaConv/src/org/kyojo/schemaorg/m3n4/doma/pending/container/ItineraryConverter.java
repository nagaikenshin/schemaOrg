package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ITINERARY;
import org.kyojo.schemaorg.m3n4.pending.Container.Itinerary;

@ExternalDomain
public class ItineraryConverter implements DomainConverter<Itinerary, String> {

	@Override
	public String fromDomainToValue(Itinerary domain) {
		return domain.getNativeValue();
	}

	@Override
	public Itinerary fromValueToDomain(String value) {
		return new ITINERARY(value);
	}

}
