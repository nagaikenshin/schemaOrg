package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MEETING_ROOM;
import org.kyojo.schemaorg.m3n4.core.Clazz.MeetingRoom;

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