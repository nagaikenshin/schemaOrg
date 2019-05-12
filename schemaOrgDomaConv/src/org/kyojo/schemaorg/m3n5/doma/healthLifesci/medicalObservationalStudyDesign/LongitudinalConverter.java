package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalObservationalStudyDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalObservationalStudyDesign.LONGITUDINAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalObservationalStudyDesign.Longitudinal;

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
