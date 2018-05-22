package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAIN_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.TrainName;

@ExternalDomain
public class TrainNameConverter implements DomainConverter<TrainName, String> {

	@Override
	public String fromDomainToValue(TrainName domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrainName fromValueToDomain(String value) {
		return new TRAIN_NAME(value);
	}

}
