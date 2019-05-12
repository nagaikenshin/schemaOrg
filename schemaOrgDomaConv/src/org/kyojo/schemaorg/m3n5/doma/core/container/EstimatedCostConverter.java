package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ESTIMATED_COST;
import org.kyojo.schemaorg.m3n5.core.Container.EstimatedCost;

@ExternalDomain
public class EstimatedCostConverter implements DomainConverter<EstimatedCost, String> {

	@Override
	public String fromDomainToValue(EstimatedCost domain) {
		return domain.getNativeValue();
	}

	@Override
	public EstimatedCost fromValueToDomain(String value) {
		return new ESTIMATED_COST(value);
	}

}
