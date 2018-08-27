package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.OPEN_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.OpenTrial;

@ExternalDomain
public class OpenTrialConverter implements DomainConverter<OpenTrial, String> {

	@Override
	public String fromDomainToValue(OpenTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public OpenTrial fromValueToDomain(String value) {
		return new OPEN_TRIAL(value);
	}

}
