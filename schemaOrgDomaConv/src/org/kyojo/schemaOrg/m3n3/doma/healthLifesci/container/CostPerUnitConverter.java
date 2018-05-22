package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.COST_PER_UNIT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.CostPerUnit;

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
