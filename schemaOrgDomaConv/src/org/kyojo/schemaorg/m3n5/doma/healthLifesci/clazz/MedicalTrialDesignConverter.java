package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_TRIAL_DESIGN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTrialDesign;

@ExternalDomain
public class MedicalTrialDesignConverter implements DomainConverter<MedicalTrialDesign, String> {

	@Override
	public String fromDomainToValue(MedicalTrialDesign domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalTrialDesign fromValueToDomain(String value) {
		return new MEDICAL_TRIAL_DESIGN(value);
	}

}
