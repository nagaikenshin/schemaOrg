package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ARTFORM;
import org.kyojo.schemaorg.m3n4.core.Container.Artform;

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
