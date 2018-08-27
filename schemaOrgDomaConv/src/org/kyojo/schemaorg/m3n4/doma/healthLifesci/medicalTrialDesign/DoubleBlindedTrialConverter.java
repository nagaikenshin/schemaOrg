package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.DOUBLE_BLINDED_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.DoubleBlindedTrial;

@ExternalDomain
public class DoubleBlindedTrialConverter implements DomainConverter<DoubleBlindedTrial, String> {

	@Override
	public String fromDomainToValue(DoubleBlindedTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public DoubleBlindedTrial fromValueToDomain(String value) {
		return new DOUBLE_BLINDED_TRIAL(value);
	}

}
