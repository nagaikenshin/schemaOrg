package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalObservationalStudyDesign.LONGITUDINAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalObservationalStudyDesign.Longitudinal;

@ExternalDomain
public class LongitudinalConverter implements DomainConverter<Longitudinal, String> {

	@Override
	public String fromDomainToValue(Longitudinal domain) {
		return domain.getNativeValue();
	}

	@Override
	public Longitudinal fromValueToDomain(String value) {
		return new LONGITUDINAL(value);
	}

}
