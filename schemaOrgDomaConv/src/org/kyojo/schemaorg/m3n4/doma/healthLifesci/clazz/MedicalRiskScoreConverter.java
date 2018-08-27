package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_RISK_SCORE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskScore;

@ExternalDomain
public class MedicalRiskScoreConverter implements DomainConverter<MedicalRiskScore, String> {

	@Override
	public String fromDomainToValue(MedicalRiskScore domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalRiskScore fromValueToDomain(String value) {
		return new MEDICAL_RISK_SCORE(value);
	}

}