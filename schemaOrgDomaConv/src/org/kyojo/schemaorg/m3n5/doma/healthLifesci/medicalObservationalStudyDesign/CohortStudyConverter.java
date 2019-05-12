package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalObservationalStudyDesign.COHORT_STUDY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalObservationalStudyDesign.CohortStudy;

@ExternalDomain
public class CohortStudyConverter implements DomainConverter<CohortStudy, String> {

	@Override
	public String fromDomainToValue(CohortStudy domain) {
		return domain.getNativeValue();
	}

	@Override
	public CohortStudy fromValueToDomain(String value) {
		return new COHORT_STUDY(value);
	}

}
