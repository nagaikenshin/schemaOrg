package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ALBUM_RELEASE;
import org.kyojo.schemaorg.m3n5.core.Container.AlbumRelease;

@ExternalDomain
public class AlbumReleaseConverter implements DomainConverter<AlbumRelease, String> {

	@Override
	public String fromDomainToValue(AlbumRelease domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlbumRelease fromValueToDomain(String value) {
		return new ALBUM_RELEASE(value);
	}

}
