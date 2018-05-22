package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAIN_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.TrainNumber;

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
