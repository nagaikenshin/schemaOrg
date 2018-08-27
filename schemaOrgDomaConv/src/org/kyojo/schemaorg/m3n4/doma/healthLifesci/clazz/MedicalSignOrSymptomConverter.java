package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_SIGN_OR_SYMPTOM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;

@ExternalDomain
public class MedicalSignOrSymptomConverter implements DomainConverter<MedicalSignOrSymptom, String> {

	@Override
	public String fromDomainToValue(MedicalSignOrSymptom domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalSignOrSymptom fromValueToDomain(String value) {
		return new MEDICAL_SIGN_OR_SYMPTOM(value);
	}

}
