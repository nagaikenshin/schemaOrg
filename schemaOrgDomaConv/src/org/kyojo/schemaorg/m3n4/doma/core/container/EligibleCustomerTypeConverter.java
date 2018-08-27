package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ELIGIBLE_CUSTOMER_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleCustomerType;

@ExternalDomain
public class EligibleCustomerTypeConverter implements DomainConverter<EligibleCustomerType, String> {

	@Override
	public String fromDomainToValue(EligibleCustomerType domain) {
		return domain.getNativeValue();
	}

	@Override
	public EligibleCustomerType fromValueToDomain(String value) {
		return new ELIGIBLE_CUSTOMER_TYPE(value);
	}

}
