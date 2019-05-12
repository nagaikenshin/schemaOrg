package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SIGN_OR_SYMPTOM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SignOrSymptom;

@ExternalDomain
public class SignOrSymptomConverter implements DomainConverter<SignOrSymptom, String> {

	@Override
	public String fromDomainToValue(SignOrSymptom domain) {
		return domain.getNativeValue();
	}

	@Override
	public SignOrSymptom fromValueToDomain(String value) {
		return new SIGN_OR_SYMPTOM(value);
	}

}
