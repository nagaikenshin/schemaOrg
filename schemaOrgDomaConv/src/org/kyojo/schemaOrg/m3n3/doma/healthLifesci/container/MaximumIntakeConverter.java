package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MAXIMUM_INTAKE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MaximumIntake;

@ExternalDomain
public class MaximumIntakeConverter implements DomainConverter<MaximumIntake, String> {

	@Override
	public String fromDomainToValue(MaximumIntake domain) {
		return domain.getNativeValue();
	}

	@Override
	public MaximumIntake fromValueToDomain(String value) {
		return new MAXIMUM_INTAKE(value);
	}

}
