package org.kyojo.schemaorg.m3n5.doma.core.musicAlbumReleaseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.musicAlbumReleaseType.SINGLE_RELEASE;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumReleaseType.SingleRelease;

@ExternalDomain
public class SingleReleaseConverter implements DomainConverter<SingleRelease, String> {

	@Override
	public String fromDomainToValue(SingleRelease domain) {
		return domain.getNativeValue();
	}

	@Override
	public SingleRelease fromValueToDomain(String value) {
		return new SINGLE_RELEASE(value);
	}

}
