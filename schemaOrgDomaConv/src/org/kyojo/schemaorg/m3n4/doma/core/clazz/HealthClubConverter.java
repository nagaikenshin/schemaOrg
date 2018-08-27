package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HEALTH_CLUB;
import org.kyojo.schemaorg.m3n4.core.Clazz.HealthClub;

@ExternalDomain
public class HealthClubConverter implements DomainConverter<HealthClub, String> {

	@Override
	public String fromDomainToValue(HealthClub domain) {
		return domain.getNativeValue();
	}

	@Override
	public HealthClub fromValueToDomain(String value) {
		return new HEALTH_CLUB(value);
	}

}
