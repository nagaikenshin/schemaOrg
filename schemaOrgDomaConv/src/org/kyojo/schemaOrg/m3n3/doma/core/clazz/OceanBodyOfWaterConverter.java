package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OCEAN_BODY_OF_WATER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OceanBodyOfWater;

@ExternalDomain
public class OceanBodyOfWaterConverter implements DomainConverter<OceanBodyOfWater, String> {

	@Override
	public String fromDomainToValue(OceanBodyOfWater domain) {
		return domain.getNativeValue();
	}

	@Override
	public OceanBodyOfWater fromValueToDomain(String value) {
		return new OCEAN_BODY_OF_WATER(value);
	}

}
