package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CARBOHYDRATE_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.CarbohydrateContent;

@ExternalDomain
public class CarbohydrateContentConverter implements DomainConverter<CarbohydrateContent, String> {

	@Override
	public String fromDomainToValue(CarbohydrateContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public CarbohydrateContent fromValueToDomain(String value) {
		return new CARBOHYDRATE_CONTENT(value);
	}

}
