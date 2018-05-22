package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAIN_STATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TrainStation;

@ExternalDomain
public class TrainStationConverter implements DomainConverter<TrainStation, String> {

	@Override
	public String fromDomainToValue(TrainStation domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrainStation fromValueToDomain(String value) {
		return new TRAIN_STATION(value);
	}

}
