package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_RISK_FACTOR;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalRiskFactor;

@ExternalDomain
public class MedicalRiskFactorConverter implements DomainConverter<MedicalRiskFactor, String> {

	@Override
	public String fromDomainToValue(MedicalRiskFactor domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalRiskFactor fromValueToDomain(String value) {
		return new MEDICAL_RISK_FACTOR(value);
	}

}
