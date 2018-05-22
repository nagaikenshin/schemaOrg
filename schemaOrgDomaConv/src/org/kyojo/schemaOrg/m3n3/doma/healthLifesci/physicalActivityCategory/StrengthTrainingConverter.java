package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalActivityCategory.STRENGTH_TRAINING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalActivityCategory.StrengthTraining;

@ExternalDomain
public class StrengthTrainingConverter implements DomainConverter<StrengthTraining, String> {

	@Override
	public String fromDomainToValue(StrengthTraining domain) {
		return domain.getNativeValue();
	}

	@Override
	public StrengthTraining fromValueToDomain(String value) {
		return new STRENGTH_TRAINING(value);
	}

}
