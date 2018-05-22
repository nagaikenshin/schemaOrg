package org.kyojo.schemaOrg.m3n3.doma.core.musicAlbumReleaseType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicAlbumReleaseType.BROADCAST_RELEASE;
import org.kyojo.schemaOrg.m3n3.core.MusicAlbumReleaseType.BroadcastRelease;

@ExternalDomain
public class BroadcastReleaseConverter implements DomainConverter<BroadcastRelease, String> {

	@Override
	public String fromDomainToValue(BroadcastRelease domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastRelease fromValueToDomain(String value) {
		return new BROADCAST_RELEASE(value);
	}

}
