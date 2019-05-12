package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalTrialDesign.INTERNATIONAL_TRIAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalTrialDesign.InternationalTrial;

@ExternalDomain
public class InternationalTrialConverter implements DomainConverter<InternationalTrial, String> {

	@Override
	public String fromDomainToValue(InternationalTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public InternationalTrial fromValueToDomain(String value) {
		return new INTERNATIONAL_TRIAL(value);
	}

}