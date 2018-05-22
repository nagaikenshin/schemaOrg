package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_VIDEO_OBJECT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicVideoObject;

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
