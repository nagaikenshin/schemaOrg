package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOUSE;
import org.kyojo.schemaorg.m3n5.core.Clazz.House;

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