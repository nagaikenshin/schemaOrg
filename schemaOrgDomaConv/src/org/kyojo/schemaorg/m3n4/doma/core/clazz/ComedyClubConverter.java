package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMEDY_CLUB;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyClub;

@ExternalDomain
public class ComedyClubConverter implements DomainConverter<ComedyClub, String> {

	@Override
	public String fromDomainToValue(ComedyClub domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComedyClub fromValueToDomain(String value) {
		return new COMEDY_CLUB(value);
	}

}
