package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ESTIMATED_COST;
import org.kyojo.schemaOrg.m3n3.core.Container.EstimatedCost;

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
