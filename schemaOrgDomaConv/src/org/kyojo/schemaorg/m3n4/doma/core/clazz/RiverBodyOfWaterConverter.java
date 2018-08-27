package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RIVER_BODY_OF_WATER;
import org.kyojo.schemaorg.m3n4.core.Clazz.RiverBodyOfWater;

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
