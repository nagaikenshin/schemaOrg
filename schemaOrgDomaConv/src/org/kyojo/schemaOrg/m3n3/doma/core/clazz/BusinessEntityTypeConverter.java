package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUSINESS_ENTITY_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessEntityType;

@ExternalDomain
public class BusinessEntityTypeConverter implements DomainConverter<BusinessEntityType, String> {

	@Override
	public String fromDomainToValue(BusinessEntityType domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusinessEntityType fromValueToDomain(String value) {
		return new BUSINESS_ENTITY_TYPE(value);
	}

}
