package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ADVANCE_BOOKING_REQUIREMENT;
import org.kyojo.schemaorg.m3n5.core.Container.AdvanceBookingRequirement;

@ExternalDomain
public class AdvanceBookingRequirementConverter implements DomainConverter<AdvanceBookingRequirement, String> {

	@Override
	public String fromDomainToValue(AdvanceBookingRequirement domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdvanceBookingRequirement fromValueToDomain(String value) {
		return new ADVANCE_BOOKING_REQUIREMENT(value);
	}

}
