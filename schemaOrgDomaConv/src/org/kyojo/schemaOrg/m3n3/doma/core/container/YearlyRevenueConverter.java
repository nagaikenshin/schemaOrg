package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.YEARLY_REVENUE;
import org.kyojo.schemaOrg.m3n3.core.Container.YearlyRevenue;

@ExternalDomain
public class YearlyRevenueConverter implements DomainConverter<YearlyRevenue, String> {

	@Override
	public String fromDomainToValue(YearlyRevenue domain) {
		return domain.getNativeValue();
	}

	@Override
	public YearlyRevenue fromValueToDomain(String value) {
		return new YEARLY_REVENUE(value);
	}

}
