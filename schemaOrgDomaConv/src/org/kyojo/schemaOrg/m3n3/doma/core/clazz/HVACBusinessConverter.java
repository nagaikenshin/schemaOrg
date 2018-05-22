package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HVAC_BUSINESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HVACBusiness;

@ExternalDomain
public class HVACBusinessConverter implements DomainConverter<HVACBusiness, String> {

	@Override
	public String fromDomainToValue(HVACBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public HVACBusiness fromValueToDomain(String value) {
		return new HVAC_BUSINESS(value);
	}

}
