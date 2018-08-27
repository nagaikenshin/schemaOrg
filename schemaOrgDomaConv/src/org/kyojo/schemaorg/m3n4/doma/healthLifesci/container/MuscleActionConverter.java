package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MUSCLE_ACTION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MuscleAction;

@ExternalDomain
public class MuscleActionConverter implements DomainConverter<MuscleAction, String> {

	@Override
	public String fromDomainToValue(MuscleAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public MuscleAction fromValueToDomain(String value) {
		return new MUSCLE_ACTION(value);
	}

}
