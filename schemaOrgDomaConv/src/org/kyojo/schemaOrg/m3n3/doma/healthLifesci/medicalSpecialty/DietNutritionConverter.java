package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.DIET_NUTRITION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.DietNutrition;

@ExternalDomain
public class DietNutritionConverter implements DomainConverter<DietNutrition, String> {

	@Override
	public String fromDomainToValue(DietNutrition domain) {
		return domain.getNativeValue();
	}

	@Override
	public DietNutrition fromValueToDomain(String value) {
		return new DIET_NUTRITION(value);
	}

}
