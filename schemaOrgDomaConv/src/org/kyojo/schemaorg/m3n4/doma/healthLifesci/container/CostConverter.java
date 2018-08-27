package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.COST;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Cost;

@ExternalDomain
public class CostConverter implements DomainConverter<Cost, String> {

	@Override
	public String fromDomainToValue(Cost domain) {
		return domain.getNativeValue();
	}

	@Override
	public Cost fromValueToDomain(String value) {
		return new COST(value);
	}

}