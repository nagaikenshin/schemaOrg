package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalTrialDesign.SINGLE_BLINDED_TRIAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalTrialDesign.SingleBlindedTrial;

@ExternalDomain
public class SingleBlindedTrialConverter implements DomainConverter<SingleBlindedTrial, String> {

	@Override
	public String fromDomainToValue(SingleBlindedTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public SingleBlindedTrial fromValueToDomain(String value) {
		return new SINGLE_BLINDED_TRIAL(value);
	}

}
