package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUSINESS_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessEvent;

@ExternalDomain
public class BusinessEventConverter implements DomainConverter<BusinessEvent, String> {

	@Override
	public String fromDomainToValue(BusinessEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusinessEvent fromValueToDomain(String value) {
		return new BUSINESS_EVENT(value);
	}

}
