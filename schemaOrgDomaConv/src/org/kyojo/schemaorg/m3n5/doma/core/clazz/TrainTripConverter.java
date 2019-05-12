package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TRAIN_TRIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.TrainTrip;

@ExternalDomain
public class TrainTripConverter implements DomainConverter<TrainTrip, String> {

	@Override
	public String fromDomainToValue(TrainTrip domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrainTrip fromValueToDomain(String value) {
		return new TRAIN_TRIP(value);
	}

}
