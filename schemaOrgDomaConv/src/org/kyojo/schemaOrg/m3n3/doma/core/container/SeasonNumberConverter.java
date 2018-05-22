package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEASON_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.SeasonNumber;

@ExternalDomain
public class SeasonNumberConverter implements DomainConverter<SeasonNumber, String> {

	@Override
	public String fromDomainToValue(SeasonNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeasonNumber fromValueToDomain(String value) {
		return new SEASON_NUMBER(value);
	}

}
