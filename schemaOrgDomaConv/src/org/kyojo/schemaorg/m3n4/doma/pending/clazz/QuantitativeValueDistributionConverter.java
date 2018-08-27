package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.QUANTITATIVE_VALUE_DISTRIBUTION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.QuantitativeValueDistribution;

@ExternalDomain
public class QuantitativeValueDistributionConverter implements DomainConverter<QuantitativeValueDistribution, String> {

	@Override
	public String fromDomainToValue(QuantitativeValueDistribution domain) {
		return domain.getNativeValue();
	}

	@Override
	public QuantitativeValueDistribution fromValueToDomain(String value) {
		return new QUANTITATIVE_VALUE_DISTRIBUTION(value);
	}

}
