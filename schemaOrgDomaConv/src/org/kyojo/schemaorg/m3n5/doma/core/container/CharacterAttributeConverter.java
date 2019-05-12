package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHARACTER_ATTRIBUTE;
import org.kyojo.schemaorg.m3n5.core.Container.CharacterAttribute;

@ExternalDomain
public class CharacterAttributeConverter implements DomainConverter<CharacterAttribute, String> {

	@Override
	public String fromDomainToValue(CharacterAttribute domain) {
		return domain.getNativeValue();
	}

	@Override
	public CharacterAttribute fromValueToDomain(String value) {
		return new CHARACTER_ATTRIBUTE(value);
	}

}
