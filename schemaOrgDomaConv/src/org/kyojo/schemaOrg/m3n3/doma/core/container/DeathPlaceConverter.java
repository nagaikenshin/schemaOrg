package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEATH_PLACE;
import org.kyojo.schemaOrg.m3n3.core.Container.DeathPlace;

@ExternalDomain
public class DeathPlaceConverter implements DomainConverter<DeathPlace, String> {

	@Override
	public String fromDomainToValue(DeathPlace domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeathPlace fromValueToDomain(String value) {
		return new DEATH_PLACE(value);
	}

}
