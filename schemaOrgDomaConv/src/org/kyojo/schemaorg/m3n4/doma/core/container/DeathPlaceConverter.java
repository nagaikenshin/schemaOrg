package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEATH_PLACE;
import org.kyojo.schemaorg.m3n4.core.Container.DeathPlace;

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
