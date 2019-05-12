package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ALBUM_RELEASE_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.AlbumReleaseType;

@ExternalDomain
public class AlbumReleaseTypeConverter implements DomainConverter<AlbumReleaseType, String> {

	@Override
	public String fromDomainToValue(AlbumReleaseType domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlbumReleaseType fromValueToDomain(String value) {
		return new ALBUM_RELEASE_TYPE(value);
	}

}
