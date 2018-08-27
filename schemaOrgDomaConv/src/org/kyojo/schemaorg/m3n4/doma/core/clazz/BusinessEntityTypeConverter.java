package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BUSINESS_ENTITY_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessEntityType;

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
