package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHARACTER_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.CharacterName;

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
