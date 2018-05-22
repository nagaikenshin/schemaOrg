package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLACE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Place;

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
