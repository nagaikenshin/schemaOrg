package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalTrialDesign;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalTrialDesign.RANDOMIZED_TRIAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalTrialDesign.RandomizedTrial;

@ExternalDomain
public class RandomizedTrialConverter implements DomainConverter<RandomizedTrial, String> {

	@Override
	public String fromDomainToValue(RandomizedTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public RandomizedTrial fromValueToDomain(String value) {
		return new RANDOMIZED_TRIAL(value);
	}

}
