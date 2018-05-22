package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUTRITION_INFORMATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.NutritionInformation;

@ExternalDomain
public class NutritionInformationConverter implements DomainConverter<NutritionInformation, String> {

	@Override
	public String fromDomainToValue(NutritionInformation domain) {
		return domain.getNativeValue();
	}

	@Override
	public NutritionInformation fromValueToDomain(String value) {
		return new NUTRITION_INFORMATION(value);
	}

}
