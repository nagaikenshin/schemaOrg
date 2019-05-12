package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MONETARY_AMOUNT_DISTRIBUTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmountDistribution;

@ExternalDomain
public class MonetaryAmountDistributionConverter implements DomainConverter<MonetaryAmountDistribution, String> {

	@Override
	public String fromDomainToValue(MonetaryAmountDistribution domain) {
		return domain.getNativeValue();
	}

	@Override
	public MonetaryAmountDistribution fromValueToDomain(String value) {
		return new MONETARY_AMOUNT_DISTRIBUTION(value);
	}

}
