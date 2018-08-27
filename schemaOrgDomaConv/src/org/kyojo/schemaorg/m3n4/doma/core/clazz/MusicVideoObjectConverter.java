package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MUSIC_VIDEO_OBJECT;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicVideoObject;

@ExternalDomain
public class MusicVideoObjectConverter implements DomainConverter<MusicVideoObject, String> {

	@Override
	public String fromDomainToValue(MusicVideoObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicVideoObject fromValueToDomain(String value) {
		return new MUSIC_VIDEO_OBJECT(value);
	}

}
