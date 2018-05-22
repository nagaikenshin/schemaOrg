package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SIGN_DETECTED;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SignDetected;

@ExternalDomain
public class SignDetectedConverter implements DomainConverter<SignDetected, String> {

	@Override
	public String fromDomainToValue(SignDetected domain) {
		return domain.getNativeValue();
	}

	@Override
	public SignDetected fromValueToDomain(String value) {
		return new SIGN_DETECTED(value);
	}

}
