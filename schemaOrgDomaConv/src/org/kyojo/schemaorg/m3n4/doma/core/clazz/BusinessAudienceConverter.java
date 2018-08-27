package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BUSINESS_AUDIENCE;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessAudience;

@ExternalDomain
public class BusinessAudienceConverter implements DomainConverter<BusinessAudience, String> {

	@Override
	public String fromDomainToValue(BusinessAudience domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusinessAudience fromValueToDomain(String value) {
		return new BUSINESS_AUDIENCE(value);
	}

}
