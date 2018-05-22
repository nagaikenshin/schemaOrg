package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalTrialDesign.MULTI_CENTER_TRIAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalTrialDesign.MultiCenterTrial;

@ExternalDomain
public class MultiCenterTrialConverter implements DomainConverter<MultiCenterTrial, String> {

	@Override
	public String fromDomainToValue(MultiCenterTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public MultiCenterTrial fromValueToDomain(String value) {
		return new MULTI_CENTER_TRIAL(value);
	}

}
