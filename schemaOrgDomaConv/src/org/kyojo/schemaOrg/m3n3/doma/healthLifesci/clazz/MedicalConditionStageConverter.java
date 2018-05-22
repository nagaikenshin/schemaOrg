package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_CONDITION_STAGE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalConditionStage;

@ExternalDomain
public class MedicalConditionStageConverter implements DomainConverter<MedicalConditionStage, String> {

	@Override
	public String fromDomainToValue(MedicalConditionStage domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalConditionStage fromValueToDomain(String value) {
		return new MEDICAL_CONDITION_STAGE(value);
	}

}
