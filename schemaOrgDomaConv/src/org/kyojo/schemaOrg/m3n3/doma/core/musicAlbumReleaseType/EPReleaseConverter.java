package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumReleaseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumReleaseType.EP_RELEASE;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumReleaseType.EPRelease;

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
