package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_OBSERVATIONAL_STUDY_DESIGN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalObservationalStudyDesign;

@ExternalDomain
public class MedicalObservationalStudyDesignConverter implements DomainConverter<MedicalObservationalStudyDesign, String> {

	@Override
	public String fromDomainToValue(MedicalObservationalStudyDesign domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalObservationalStudyDesign fromValueToDomain(String value) {
		return new MEDICAL_OBSERVATIONAL_STUDY_DESIGN(value);
	}

}
