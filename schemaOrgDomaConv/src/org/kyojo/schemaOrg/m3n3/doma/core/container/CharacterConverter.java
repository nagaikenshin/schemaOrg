package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHARACTER;
import org.kyojo.schemaOrg.m3n3.core.Container.Character;

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
