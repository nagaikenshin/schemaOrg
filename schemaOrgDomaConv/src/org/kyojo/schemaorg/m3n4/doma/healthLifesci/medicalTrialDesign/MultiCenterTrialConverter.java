package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.MULTI_CENTER_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.MultiCenterTrial;

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
