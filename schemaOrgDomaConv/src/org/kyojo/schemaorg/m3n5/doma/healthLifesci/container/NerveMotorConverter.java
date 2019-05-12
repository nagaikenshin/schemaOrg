package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.NERVE_MOTOR;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.NerveMotor;

@ExternalDomain
public class NerveMotorConverter implements DomainConverter<NerveMotor, String> {

	@Override
	public String fromDomainToValue(NerveMotor domain) {
		return domain.getNativeValue();
	}

	@Override
	public NerveMotor fromValueToDomain(String value) {
		return new NERVE_MOTOR(value);
	}

}
