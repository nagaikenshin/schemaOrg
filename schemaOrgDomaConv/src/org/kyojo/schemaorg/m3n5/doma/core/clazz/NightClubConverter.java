package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NIGHT_CLUB;
import org.kyojo.schemaorg.m3n5.core.Clazz.NightClub;

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
