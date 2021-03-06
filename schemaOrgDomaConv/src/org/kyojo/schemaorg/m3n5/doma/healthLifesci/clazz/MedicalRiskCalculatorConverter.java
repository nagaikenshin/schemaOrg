package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_RISK_CALCULATOR;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalRiskCalculator;

@ExternalDomain
public class MedicalRiskCalculatorConverter implements DomainConverter<MedicalRiskCalculator, String> {

	@Override
	public String fromDomainToValue(MedicalRiskCalculator domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalRiskCalculator fromValueToDomain(String value) {
		return new MEDICAL_RISK_CALCULATOR(value);
	}

}
