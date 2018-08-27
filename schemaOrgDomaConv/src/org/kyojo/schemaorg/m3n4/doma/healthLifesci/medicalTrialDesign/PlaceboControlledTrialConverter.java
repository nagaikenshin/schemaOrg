package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.PLACEBO_CONTROLLED_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.PlaceboControlledTrial;

@ExternalDomain
public class PlaceboControlledTrialConverter implements DomainConverter<PlaceboControlledTrial, String> {

	@Override
	public String fromDomainToValue(PlaceboControlledTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlaceboControlledTrial fromValueToDomain(String value) {
		return new PLACEBO_CONTROLLED_TRIAL(value);
	}

}
