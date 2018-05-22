package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEETING_ROOM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MeetingRoom;

@ExternalDomain
public class MeetingRoomConverter implements DomainConverter<MeetingRoom, String> {

	@Override
	public String fromDomainToValue(MeetingRoom domain) {
		return domain.getNativeValue();
	}

	@Override
	public MeetingRoom fromValueToDomain(String value) {
		return new MEETING_ROOM(value);
	}

}
