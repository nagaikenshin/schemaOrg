package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EXCHANGE_RATE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.ExchangeRateSpecification;

@ExternalDomain
public class ExchangeRateSpecificationConverter implements DomainConverter<ExchangeRateSpecification, String> {

	@Override
	public String fromDomainToValue(ExchangeRateSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExchangeRateSpecification fromValueToDomain(String value) {
		return new EXCHANGE_RATE_SPECIFICATION(value);
	}

}
