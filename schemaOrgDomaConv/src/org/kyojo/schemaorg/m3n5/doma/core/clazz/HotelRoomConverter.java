package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOTEL_ROOM;
import org.kyojo.schemaorg.m3n5.core.Clazz.HotelRoom;

@ExternalDomain
public class HotelRoomConverter implements DomainConverter<HotelRoom, String> {

	@Override
	public String fromDomainToValue(HotelRoom domain) {
		return domain.getNativeValue();
	}

	@Override
	public HotelRoom fromValueToDomain(String value) {
		return new HOTEL_ROOM(value);
	}

}