package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PASSENGER_PRIORITY_STATUS;
import org.kyojo.schemaorg.m3n5.core.Container.PassengerPriorityStatus;

@ExternalDomain
public class PassengerPriorityStatusConverter implements DomainConverter<PassengerPriorityStatus, String> {

	@Override
	public String fromDomainToValue(PassengerPriorityStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public PassengerPriorityStatus fromValueToDomain(String value) {
		return new PASSENGER_PRIORITY_STATUS(value);
	}

}
