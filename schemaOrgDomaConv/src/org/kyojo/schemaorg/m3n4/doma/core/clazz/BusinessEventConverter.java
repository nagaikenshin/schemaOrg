package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BUSINESS_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessEvent;

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