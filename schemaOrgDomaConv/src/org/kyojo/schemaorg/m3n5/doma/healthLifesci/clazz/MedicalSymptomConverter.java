package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_SYMPTOM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalSymptom;

@ExternalDomain
public class MedicalSymptomConverter implements DomainConverter<MedicalSymptom, String> {

	@Override
	public String fromDomainToValue(MedicalSymptom domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalSymptom fromValueToDomain(String value) {
		return new MEDICAL_SYMPTOM(value);
	}

}
