package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_RISK_ESTIMATOR;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalRiskEstimator;

@ExternalDomain
public class MedicalRiskEstimatorConverter implements DomainConverter<MedicalRiskEstimator, String> {

	@Override
	public String fromDomainToValue(MedicalRiskEstimator domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalRiskEstimator fromValueToDomain(String value) {
		return new MEDICAL_RISK_ESTIMATOR(value);
	}

}
