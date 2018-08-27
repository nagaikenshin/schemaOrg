package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.TARGET_POPULATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.TargetPopulation;

@ExternalDomain
public class TargetPopulationConverter implements DomainConverter<TargetPopulation, String> {

	@Override
	public String fromDomainToValue(TargetPopulation domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetPopulation fromValueToDomain(String value) {
		return new TARGET_POPULATION(value);
	}

}