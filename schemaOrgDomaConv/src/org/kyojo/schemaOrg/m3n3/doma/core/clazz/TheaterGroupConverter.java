package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.THEATER_GROUP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TheaterGroup;

@ExternalDomain
public class TheaterGroupConverter implements DomainConverter<TheaterGroup, String> {

	@Override
	public String fromDomainToValue(TheaterGroup domain) {
		return domain.getNativeValue();
	}

	@Override
	public TheaterGroup fromValueToDomain(String value) {
		return new THEATER_GROUP(value);
	}

}
