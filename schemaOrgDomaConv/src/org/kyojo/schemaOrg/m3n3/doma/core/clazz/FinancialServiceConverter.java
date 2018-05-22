package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FINANCIAL_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FinancialService;

@ExternalDomain
public class FinancialServiceConverter implements DomainConverter<FinancialService, String> {

	@Override
	public String fromDomainToValue(FinancialService domain) {
		return domain.getNativeValue();
	}

	@Override
	public FinancialService fromValueToDomain(String value) {
		return new FINANCIAL_SERVICE(value);
	}

}
