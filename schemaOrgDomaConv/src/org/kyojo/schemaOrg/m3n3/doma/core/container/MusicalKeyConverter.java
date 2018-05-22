package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSICAL_KEY;
import org.kyojo.schemaOrg.m3n3.core.Container.MusicalKey;

@ExternalDomain
public class MusicalKeyConverter implements DomainConverter<MusicalKey, String> {

	@Override
	public String fromDomainToValue(MusicalKey domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicalKey fromValueToDomain(String value) {
		return new MUSICAL_KEY(value);
	}

}
