package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ARTWORK_SURFACE;
import org.kyojo.schemaorg.m3n4.core.Container.ArtworkSurface;

@ExternalDomain
public class ArtworkSurfaceConverter implements DomainConverter<ArtworkSurface, String> {

	@Override
	public String fromDomainToValue(ArtworkSurface domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArtworkSurface fromValueToDomain(String value) {
		return new ARTWORK_SURFACE(value);
	}

}
