package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUTRITION;
import org.kyojo.schemaorg.m3n5.core.Container.Nutrition;

@ExternalDomain
public class NutritionConverter implements DomainConverter<Nutrition, String> {

	@Override
	public String fromDomainToValue(Nutrition domain) {
		return domain.getNativeValue();
	}

	@Override
	public Nutrition fromValueToDomain(String value) {
		return new NUTRITION(value);
	}

}
