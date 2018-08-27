package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.COST_PER_UNIT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.CostPerUnit;

@ExternalDomain
public class CostPerUnitConverter implements DomainConverter<CostPerUnit, String> {

	@Override
	public String fromDomainToValue(CostPerUnit domain) {
		return domain.getNativeValue();
	}

	@Override
	public CostPerUnit fromValueToDomain(String value) {
		return new COST_PER_UNIT(value);
	}

}
