package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ALBUM_RELEASE;
import org.kyojo.schemaOrg.m3n3.core.Container.AlbumRelease;

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
