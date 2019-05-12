package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalTrialDesign.SINGLE_CENTER_TRIAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalTrialDesign.SingleCenterTrial;

@ExternalDomain
public class SingleCenterTrialConverter implements DomainConverter<SingleCenterTrial, String> {

	@Override
	public String fromDomainToValue(SingleCenterTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public SingleCenterTrial fromValueToDomain(String value) {
		return new SINGLE_CENTER_TRIAL(value);
	}

}
