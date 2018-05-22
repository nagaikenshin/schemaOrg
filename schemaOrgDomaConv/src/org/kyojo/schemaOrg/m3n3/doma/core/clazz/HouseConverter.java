package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOUSE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.House;

@ExternalDomain
public class HouseConverter implements DomainConverter<House, String> {

	@Override
	public String fromDomainToValue(House domain) {
		return domain.getNativeValue();
	}

	@Override
	public House fromValueToDomain(String value) {
		return new HOUSE(value);
	}

}
