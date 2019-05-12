package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WEIGHT;
import org.kyojo.schemaorg.m3n5.core.Container.Weight;

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