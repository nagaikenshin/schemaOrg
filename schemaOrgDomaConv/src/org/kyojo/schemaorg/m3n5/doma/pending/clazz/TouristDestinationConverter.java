package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.TOURIST_DESTINATION;
import org.kyojo.schemaorg.m3n5.pending.Clazz.TouristDestination;

@ExternalDomain
public class TouristDestinationConverter implements DomainConverter<TouristDestination, String> {

	@Override
	public String fromDomainToValue(TouristDestination domain) {
		return domain.getNativeValue();
	}

	@Override
	public TouristDestination fromValueToDomain(String value) {
		return new TOURIST_DESTINATION(value);
	}

}
