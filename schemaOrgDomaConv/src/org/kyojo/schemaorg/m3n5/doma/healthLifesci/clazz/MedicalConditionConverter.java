package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_CONDITION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalCondition;

@ExternalDomain
public class MedicalConditionConverter implements DomainConverter<MedicalCondition, String> {

	@Override
	public String fromDomainToValue(MedicalCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public MedicalCondition fromValueToDomain(String value) {
		return new MEDICAL_CONDITION(value);
	}

}
