package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ROOM;
import org.kyojo.schemaorg.m3n4.core.Clazz.Room;

@ExternalDomain
public class RoomConverter implements DomainConverter<Room, String> {

	@Override
	public String fromDomainToValue(Room domain) {
		return domain.getNativeValue();
	}

	@Override
	public Room fromValueToDomain(String value) {
		return new ROOM(value);
	}

}
