package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.COST_CURRENCY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CostCurrency;

@ExternalDomain
public class CostCurrencyConverter implements DomainConverter<CostCurrency, String> {

	@Override
	public String fromDomainToValue(CostCurrency domain) {
		return domain.getNativeValue();
	}

	@Override
	public CostCurrency fromValueToDomain(String value) {
		return new COST_CURRENCY(value);
	}

}
