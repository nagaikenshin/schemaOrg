package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUSINESS_FUNCTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessFunction;

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
