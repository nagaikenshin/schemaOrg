package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SODIUM_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.SodiumContent;

@ExternalDomain
public class SodiumContentConverter implements DomainConverter<SodiumContent, String> {

	@Override
	public String fromDomainToValue(SodiumContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SodiumContent fromValueToDomain(String value) {
		return new SODIUM_CONTENT(value);
	}

}
