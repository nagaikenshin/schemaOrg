package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalAudience;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalAudience.MEDICAL_RESEARCHER;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalAudience.MedicalResearcher;

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
