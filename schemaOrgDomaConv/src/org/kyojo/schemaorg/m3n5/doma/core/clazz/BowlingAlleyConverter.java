package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BOWLING_ALLEY;
import org.kyojo.schemaorg.m3n5.core.Clazz.BowlingAlley;

@ExternalDomain
public class BowlingAlleyConverter implements DomainConverter<BowlingAlley, String> {

	@Override
	public String fromDomainToValue(BowlingAlley domain) {
		return domain.getNativeValue();
	}

	@Override
	public BowlingAlley fromValueToDomain(String value) {
		return new BOWLING_ALLEY(value);
	}

}
