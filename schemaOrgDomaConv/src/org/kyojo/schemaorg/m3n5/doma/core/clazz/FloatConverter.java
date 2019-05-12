package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FLOAT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Float;

@ExternalDomain
public class FloatConverter implements DomainConverter<Float, Double> {

	@Override
	public Double fromDomainToValue(Float domain) {
		return domain.getNativeValue();
	}

	@Override
	public Float fromValueToDomain(Double value) {
		return new FLOAT(value);
	}

}
