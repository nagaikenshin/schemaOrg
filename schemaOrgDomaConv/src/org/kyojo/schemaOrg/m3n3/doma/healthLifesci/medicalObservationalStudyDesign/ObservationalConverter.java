package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalObservationalStudyDesign.OBSERVATIONAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalObservationalStudyDesign.Observational;

@ExternalDomain
public class ObservationalConverter implements DomainConverter<Observational, String> {

	@Override
	public String fromDomainToValue(Observational domain) {
		return domain.getNativeValue();
	}

	@Override
	public Observational fromValueToDomain(String value) {
		return new OBSERVATIONAL(value);
	}

}
