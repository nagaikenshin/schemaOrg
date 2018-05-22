package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUSINESS_AUDIENCE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessAudience;

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
