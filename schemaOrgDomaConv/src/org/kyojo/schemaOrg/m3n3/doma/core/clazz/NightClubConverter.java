package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NIGHT_CLUB;
import org.kyojo.schemaOrg.m3n3.core.Clazz.NightClub;

@ExternalDomain
public class NightClubConverter implements DomainConverter<NightClub, String> {

	@Override
	public String fromDomainToValue(NightClub domain) {
		return domain.getNativeValue();
	}

	@Override
	public NightClub fromValueToDomain(String value) {
		return new NIGHT_CLUB(value);
	}

}
