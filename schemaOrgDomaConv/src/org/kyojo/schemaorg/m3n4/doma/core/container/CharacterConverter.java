package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHARACTER;
import org.kyojo.schemaorg.m3n4.core.Container.Character;

@ExternalDomain
public class CharacterConverter implements DomainConverter<Character, String> {

	@Override
	public String fromDomainToValue(Character domain) {
		return domain.getNativeValue();
	}

	@Override
	public Character fromValueToDomain(String value) {
		return new CHARACTER(value);
	}

}
