package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalAudience;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalAudience.MEDICAL_RESEARCHER;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalAudience.MedicalResearcher;

@ExternalDomain
public class MedicalResearcherConverter implements DomainConverter<MedicalResearcher, String> {

	@Override
	public String fromDomainToValue(MedicalResearcher domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalResearcher fromValueToDomain(String value) {
		return new MEDICAL_RESEARCHER(value);
	}

}
