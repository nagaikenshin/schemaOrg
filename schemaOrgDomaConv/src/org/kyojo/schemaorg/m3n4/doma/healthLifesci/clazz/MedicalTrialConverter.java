package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTrial;

@ExternalDomain
public class MedicalTrialConverter implements DomainConverter<MedicalTrial, String> {

	@Override
	public String fromDomainToValue(MedicalTrial domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalTrial fromValueToDomain(String value) {
		return new MEDICAL_TRIAL(value);
	}

}
