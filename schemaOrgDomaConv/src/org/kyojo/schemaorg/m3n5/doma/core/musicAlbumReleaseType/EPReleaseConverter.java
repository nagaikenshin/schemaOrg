package org.kyojo.schemaorg.m3n5.doma.core.musicAlbumReleaseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.musicAlbumReleaseType.EP_RELEASE;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumReleaseType.EPRelease;

@ExternalDomain
public class EPReleaseConverter implements DomainConverter<EPRelease, String> {

	@Override
	public String fromDomainToValue(EPRelease domain) {
		return domain.getNativeValue();
	}

	@Override
	public EPRelease fromValueToDomain(String value) {
		return new EP_RELEASE(value);
	}

}