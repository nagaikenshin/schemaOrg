package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUSINESS_FUNCTION;
import org.kyojo.schemaorg.m3n5.core.Container.BusinessFunction;

@ExternalDomain
public class BusinessFunctionConverter implements DomainConverter<BusinessFunction, String> {

	@Override
	public String fromDomainToValue(BusinessFunction domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusinessFunction fromValueToDomain(String value) {
		return new BUSINESS_FUNCTION(value);
	}

}
