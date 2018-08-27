package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.WEIGHT_TOTAL;
import org.kyojo.schemaorg.m3n4.auto.Container.WeightTotal;

@ExternalDomain
public class WeightTotalConverter implements DomainConverter<WeightTotal, String> {

	@Override
	public String fromDomainToValue(WeightTotal domain) {
		return domain.getNativeValue();
	}

	@Override
	public WeightTotal fromValueToDomain(String value) {
		return new WEIGHT_TOTAL(value);
	}

}
