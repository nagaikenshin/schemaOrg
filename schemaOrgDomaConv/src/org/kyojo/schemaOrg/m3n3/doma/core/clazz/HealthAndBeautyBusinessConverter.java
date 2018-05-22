package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HEALTH_AND_BEAUTY_BUSINESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HealthAndBeautyBusiness;

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
