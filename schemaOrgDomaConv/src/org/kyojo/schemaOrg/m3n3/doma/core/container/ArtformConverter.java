package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARTFORM;
import org.kyojo.schemaOrg.m3n3.core.Container.Artform;

@ExternalDomain
public class ArtformConverter implements DomainConverter<Artform, String> {

	@Override
	public String fromDomainToValue(Artform domain) {
		return domain.getNativeValue();
	}

	@Override
	public Artform fromValueToDomain(String value) {
		return new ARTFORM(value);
	}

}
