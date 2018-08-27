package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PLACE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;

@ExternalDomain
public class PlaceConverter implements DomainConverter<Place, String> {

	@Override
	public String fromDomainToValue(Place domain) {
		return domain.getNativeValue();
	}

	@Override
	public Place fromValueToDomain(String value) {
		return new PLACE(value);
	}

}
