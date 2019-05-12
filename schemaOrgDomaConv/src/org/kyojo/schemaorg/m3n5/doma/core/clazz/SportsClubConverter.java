package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_CLUB;
import org.kyojo.schemaorg.m3n5.core.Clazz.SportsClub;

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