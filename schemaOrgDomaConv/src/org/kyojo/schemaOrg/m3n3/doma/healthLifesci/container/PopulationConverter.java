package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.POPULATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Population;

@ExternalDomain
public class PopulationConverter implements DomainConverter<Population, String> {

	@Override
	public String fromDomainToValue(Population domain) {
		return domain.getNativeValue();
	}

	@Override
	public Population fromValueToDomain(String value) {
		return new POPULATION(value);
	}

}
