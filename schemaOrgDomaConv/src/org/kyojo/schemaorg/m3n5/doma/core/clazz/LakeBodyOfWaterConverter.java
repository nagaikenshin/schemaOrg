package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LAKE_BODY_OF_WATER;
import org.kyojo.schemaorg.m3n5.core.Clazz.LakeBodyOfWater;

@ExternalDomain
public class LakeBodyOfWaterConverter implements DomainConverter<LakeBodyOfWater, String> {

	@Override
	public String fromDomainToValue(LakeBodyOfWater domain) {
		return domain.getNativeValue();
	}

	@Override
	public LakeBodyOfWater fromValueToDomain(String value) {
		return new LAKE_BODY_OF_WATER(value);
	}

}