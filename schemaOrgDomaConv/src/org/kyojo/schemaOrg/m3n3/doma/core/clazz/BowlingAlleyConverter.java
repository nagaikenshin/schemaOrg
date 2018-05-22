package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOWLING_ALLEY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BowlingAlley;

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
