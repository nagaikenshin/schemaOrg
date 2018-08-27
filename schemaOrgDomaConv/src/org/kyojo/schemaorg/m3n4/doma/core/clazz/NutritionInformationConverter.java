package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUTRITION_INFORMATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.NutritionInformation;

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
