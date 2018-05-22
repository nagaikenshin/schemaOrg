package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEA_BODY_OF_WATER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SeaBodyOfWater;

@ExternalDomain
public class SeaBodyOfWaterConverter implements DomainConverter<SeaBodyOfWater, String> {

	@Override
	public String fromDomainToValue(SeaBodyOfWater domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeaBodyOfWater fromValueToDomain(String value) {
		return new SEA_BODY_OF_WATER(value);
	}

}
