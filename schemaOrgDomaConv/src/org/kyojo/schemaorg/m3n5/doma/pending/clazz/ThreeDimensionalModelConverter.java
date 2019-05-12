package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.THREE_DIMENSIONAL_MODEL;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ThreeDimensionalModel;

@ExternalDomain
public class ThreeDimensionalModelConverter implements DomainConverter<ThreeDimensionalModel, String> {

	@Override
	public String fromDomainToValue(ThreeDimensionalModel domain) {
		return domain.getNativeValue();
	}

	@Override
	public ThreeDimensionalModel fromValueToDomain(String value) {
		return new THREE_DIMENSIONAL_MODEL(value);
	}

}
