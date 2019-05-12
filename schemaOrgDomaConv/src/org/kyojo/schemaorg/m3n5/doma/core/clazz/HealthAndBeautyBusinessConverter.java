package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HEALTH_AND_BEAUTY_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.HealthAndBeautyBusiness;

@ExternalDomain
public class HealthAndBeautyBusinessConverter implements DomainConverter<HealthAndBeautyBusiness, String> {

	@Override
	public String fromDomainToValue(HealthAndBeautyBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthAndBeautyBusiness fromValueToDomain(String value) {
		return new HEALTH_AND_BEAUTY_BUSINESS(value);
	}

}