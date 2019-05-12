package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESERVATION_STATUS_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReservationStatusType;

@ExternalDomain
public class ReservationStatusTypeConverter implements DomainConverter<ReservationStatusType, String> {

	@Override
	public String fromDomainToValue(ReservationStatusType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReservationStatusType fromValueToDomain(String value) {
		return new RESERVATION_STATUS_TYPE(value);
	}

}