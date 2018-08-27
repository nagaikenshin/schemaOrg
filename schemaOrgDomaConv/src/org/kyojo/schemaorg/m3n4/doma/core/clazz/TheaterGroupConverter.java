package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.THEATER_GROUP;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterGroup;

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
