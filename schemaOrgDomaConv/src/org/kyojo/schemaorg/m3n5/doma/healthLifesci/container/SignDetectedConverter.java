package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SIGN_DETECTED;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SignDetected;

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
