package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RIVER_BODY_OF_WATER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RiverBodyOfWater;

@ExternalDomain
public class RiverBodyOfWaterConverter implements DomainConverter<RiverBodyOfWater, String> {

	@Override
	public String fromDomainToValue(RiverBodyOfWater domain) {
		return domain.getNativeValue();
	}

	@Override
	public RiverBodyOfWater fromValueToDomain(String value) {
		return new RIVER_BODY_OF_WATER(value);
	}

}
