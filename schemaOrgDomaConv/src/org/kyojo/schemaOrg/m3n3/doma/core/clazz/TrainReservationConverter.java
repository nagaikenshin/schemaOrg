package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAIN_RESERVATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TrainReservation;

@ExternalDomain
public class TrainReservationConverter implements DomainConverter<TrainReservation, String> {

	@Override
	public String fromDomainToValue(TrainReservation domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrainReservation fromValueToDomain(String value) {
		return new TRAIN_RESERVATION(value);
	}

}
