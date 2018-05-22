package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPORTS_CLUB;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SportsClub;

@ExternalDomain
public class SportsClubConverter implements DomainConverter<SportsClub, String> {

	@Override
	public String fromDomainToValue(SportsClub domain) {
		return domain.getNativeValue();
	}

	@Override
	public SportsClub fromValueToDomain(String value) {
		return new SPORTS_CLUB(value);
	}

}
