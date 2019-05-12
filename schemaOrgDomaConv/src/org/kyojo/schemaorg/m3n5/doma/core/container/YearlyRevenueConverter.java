package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.YEARLY_REVENUE;
import org.kyojo.schemaorg.m3n5.core.Container.YearlyRevenue;

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
