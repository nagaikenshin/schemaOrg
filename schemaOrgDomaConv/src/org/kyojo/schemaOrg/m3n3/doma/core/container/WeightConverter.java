package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WEIGHT;
import org.kyojo.schemaOrg.m3n3.core.Container.Weight;

@ExternalDomain
public class WeightConverter implements DomainConverter<Weight, String> {

	@Override
	public String fromDomainToValue(Weight domain) {
		return domain.getNativeValue();
	}

	@Override
	public Weight fromValueToDomain(String value) {
		return new WEIGHT(value);
	}

}
