package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.TRIPLE_BLINDED_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.TripleBlindedTrial;

@ExternalDomain
public class TripleBlindedTrialConverter implements DomainConverter<TripleBlindedTrial, String> {

	@Override
	public String fromDomainToValue(TripleBlindedTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public TripleBlindedTrial fromValueToDomain(String value) {
		return new TRIPLE_BLINDED_TRIAL(value);
	}

}
