package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_RELEASE_FORMAT;
import org.kyojo.schemaorg.m3n5.core.Container.MusicReleaseFormat;

@ExternalDomain
public class MusicReleaseFormatConverter implements DomainConverter<MusicReleaseFormat, String> {

	@Override
	public String fromDomainToValue(MusicReleaseFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicReleaseFormat fromValueToDomain(String value) {
		return new MUSIC_RELEASE_FORMAT(value);
	}

}
