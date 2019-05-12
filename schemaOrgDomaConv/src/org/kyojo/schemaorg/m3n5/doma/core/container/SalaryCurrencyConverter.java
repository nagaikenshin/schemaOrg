package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SALARY_CURRENCY;
import org.kyojo.schemaorg.m3n5.core.Container.SalaryCurrency;

@ExternalDomain
public class SalaryCurrencyConverter implements DomainConverter<SalaryCurrency, String> {

	@Override
	public String fromDomainToValue(SalaryCurrency domain) {
		return domain.getNativeValue();
	}

	@Override
	public SalaryCurrency fromValueToDomain(String value) {
		return new SALARY_CURRENCY(value);
	}

}