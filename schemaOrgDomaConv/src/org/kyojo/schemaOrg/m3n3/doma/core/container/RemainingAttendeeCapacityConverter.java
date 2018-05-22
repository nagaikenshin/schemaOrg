package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REMAINING_ATTENDEE_CAPACITY;
import org.kyojo.schemaOrg.m3n3.core.Container.RemainingAttendeeCapacity;

@ExternalDomain
public class RemainingAttendeeCapacityConverter implements DomainConverter<RemainingAttendeeCapacity, Long> {

	@Override
	public Long fromDomainToValue(RemainingAttendeeCapacity domain) {
		return domain.getNativeValue();
	}

	@Override
	public RemainingAttendeeCapacity fromValueToDomain(Long value) {
		return new REMAINING_ATTENDEE_CAPACITY(value);
	}

}
