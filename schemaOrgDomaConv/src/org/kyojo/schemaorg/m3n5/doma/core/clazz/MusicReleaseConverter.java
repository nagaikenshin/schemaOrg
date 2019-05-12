package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_RELEASE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicRelease;

@ExternalDomain
public class MusicReleaseConverter implements DomainConverter<MusicRelease, String> {

	@Override
	public String fromDomainToValue(MusicRelease domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicRelease fromValueToDomain(String value) {
		return new MUSIC_RELEASE(value);
	}

}
