package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.SPOKEN_BY_CHARACTER;
import org.kyojo.schemaorg.m3n4.pending.Container.SpokenByCharacter;

@ExternalDomain
public class SpokenByCharacterConverter implements DomainConverter<SpokenByCharacter, String> {

	@Override
	public String fromDomainToValue(SpokenByCharacter domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpokenByCharacter fromValueToDomain(String value) {
		return new SPOKEN_BY_CHARACTER(value);
	}

}