package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalTrialDesign.DOUBLE_BLINDED_TRIAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalTrialDesign.DoubleBlindedTrial;

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
