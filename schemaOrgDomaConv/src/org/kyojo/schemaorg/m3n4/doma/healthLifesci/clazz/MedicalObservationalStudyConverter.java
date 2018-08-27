package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_OBSERVATIONAL_STUDY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalObservationalStudy;

@ExternalDomain
public class MedicalObservationalStudyConverter implements DomainConverter<MedicalObservationalStudy, String> {

	@Override
	public String fromDomainToValue(MedicalObservationalStudy domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalObservationalStudy fromValueToDomain(String value) {
		return new MEDICAL_OBSERVATIONAL_STUDY(value);
	}

}
