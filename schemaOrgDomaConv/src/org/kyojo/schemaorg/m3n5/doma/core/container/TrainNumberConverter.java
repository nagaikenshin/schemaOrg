package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TRAIN_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.TrainNumber;

@ExternalDomain
public class TrainNumberConverter implements DomainConverter<TrainNumber, String> {

	@Override
	public String fromDomainToValue(TrainNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrainNumber fromValueToDomain(String value) {
		return new TRAIN_NUMBER(value);
	}

}
