package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CARBOHYDRATE_CONTENT;
import org.kyojo.schemaOrg.m3n3.core.Container.CarbohydrateContent;

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
