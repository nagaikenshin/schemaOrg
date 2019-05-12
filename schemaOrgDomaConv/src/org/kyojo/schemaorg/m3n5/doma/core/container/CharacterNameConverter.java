package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHARACTER_NAME;
import org.kyojo.schemaorg.m3n5.core.Container.CharacterName;

@ExternalDomain
public class CharacterNameConverter implements DomainConverter<CharacterName, String> {

	@Override
	public String fromDomainToValue(CharacterName domain) {
		return domain.getNativeValue();
	}

	@Override
	public CharacterName fromValueToDomain(String value) {
		return new CHARACTER_NAME(value);
	}

}
