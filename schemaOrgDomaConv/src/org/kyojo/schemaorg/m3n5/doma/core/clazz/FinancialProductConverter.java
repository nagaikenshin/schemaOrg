package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FINANCIAL_PRODUCT;
import org.kyojo.schemaorg.m3n5.core.Clazz.FinancialProduct;

@ExternalDomain
public class FinancialProductConverter implements DomainConverter<FinancialProduct, String> {

	@Override
	public String fromDomainToValue(FinancialProduct domain) {
		return domain.getNativeValue();
	}

	@Override
	public FinancialProduct fromValueToDomain(String value) {
		return new FINANCIAL_PRODUCT(value);
	}

}
