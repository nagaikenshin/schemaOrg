package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOTEL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Hotel;

@ExternalDomain
public class HotelConverter implements DomainConverter<Hotel, String> {

	@Override
	public String fromDomainToValue(Hotel domain) {
		return domain.getNativeValue();
	}

	@Override
	public Hotel fromValueToDomain(String value) {
		return new HOTEL(value);
	}

}
