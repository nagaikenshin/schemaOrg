package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BY_ARTIST;
import org.kyojo.schemaorg.m3n5.core.Container.ByArtist;

@ExternalDomain
public class ByArtistConverter implements DomainConverter<ByArtist, String> {

	@Override
	public String fromDomainToValue(ByArtist domain) {
		return domain.getNativeValue();
	}

	@Override
	public ByArtist fromValueToDomain(String value) {
		return new BY_ARTIST(value);
	}

}
