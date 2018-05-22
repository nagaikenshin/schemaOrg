package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BODY_OF_WATER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BodyOfWater;

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
