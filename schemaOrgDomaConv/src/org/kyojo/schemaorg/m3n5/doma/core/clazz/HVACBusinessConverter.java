package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HVAC_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.HVACBusiness;

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
