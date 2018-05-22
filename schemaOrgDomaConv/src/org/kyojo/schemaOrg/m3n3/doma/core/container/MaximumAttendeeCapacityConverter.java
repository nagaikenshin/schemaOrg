package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MAXIMUM_ATTENDEE_CAPACITY;
import org.kyojo.schemaOrg.m3n3.core.Container.MaximumAttendeeCapacity;

@ExternalDomain
public class MaximumAttendeeCapacityConverter implements DomainConverter<MaximumAttendeeCapacity, Long> {

	@Override
	public Long fromDomainToValue(MaximumAttendeeCapacity domain) {
		return domain.getNativeValue();
	}

	@Override
	public MaximumAttendeeCapacity fromValueToDomain(Long value) {
		return new MAXIMUM_ATTENDEE_CAPACITY(value);
	}

}
