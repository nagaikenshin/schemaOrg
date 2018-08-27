package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TRAIN_RESERVATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainReservation;

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
