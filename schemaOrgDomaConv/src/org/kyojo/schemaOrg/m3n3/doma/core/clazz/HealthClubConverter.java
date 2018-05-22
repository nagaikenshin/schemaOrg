package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HEALTH_CLUB;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HealthClub;

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
