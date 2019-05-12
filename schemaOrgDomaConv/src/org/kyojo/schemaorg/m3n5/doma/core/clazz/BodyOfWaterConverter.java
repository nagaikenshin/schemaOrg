package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BODY_OF_WATER;
import org.kyojo.schemaorg.m3n5.core.Clazz.BodyOfWater;

@ExternalDomain
public class BodyOfWaterConverter implements DomainConverter<BodyOfWater, String> {

	@Override
	public String fromDomainToValue(BodyOfWater domain) {
		return domain.getNativeValue();
	}

	@Override
	public BodyOfWater fromValueToDomain(String value) {
		return new BODY_OF_WATER(value);
	}

}
