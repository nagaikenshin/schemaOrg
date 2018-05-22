package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PASSENGER_SEQUENCE_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.PassengerSequenceNumber;

@ExternalDomain
public class PassengerSequenceNumberConverter implements DomainConverter<PassengerSequenceNumber, String> {

	@Override
	public String fromDomainToValue(PassengerSequenceNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public PassengerSequenceNumber fromValueToDomain(String value) {
		return new PASSENGER_SEQUENCE_NUMBER(value);
	}

}
