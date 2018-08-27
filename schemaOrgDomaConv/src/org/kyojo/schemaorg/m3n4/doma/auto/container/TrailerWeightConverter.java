package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.TRAILER_WEIGHT;
import org.kyojo.schemaorg.m3n4.auto.Container.TrailerWeight;

@ExternalDomain
public class TrailerWeightConverter implements DomainConverter<TrailerWeight, String> {

	@Override
	public String fromDomainToValue(TrailerWeight domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrailerWeight fromValueToDomain(String value) {
		return new TRAILER_WEIGHT(value);
	}

}
