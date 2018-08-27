package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.STADIUM_OR_ARENA;
import org.kyojo.schemaorg.m3n4.core.Clazz.StadiumOrArena;

@ExternalDomain
public class StadiumOrArenaConverter implements DomainConverter<StadiumOrArena, String> {

	@Override
	public String fromDomainToValue(StadiumOrArena domain) {
		return domain.getNativeValue();
	}

	@Override
	public StadiumOrArena fromValueToDomain(String value) {
		return new STADIUM_OR_ARENA(value);
	}

}
