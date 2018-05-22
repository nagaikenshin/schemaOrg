package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO_GAME;
import org.kyojo.schemaOrg.m3n3.core.Clazz.VideoGame;

@ExternalDomain
public class VideoGameConverter implements DomainConverter<VideoGame, String> {

	@Override
	public String fromDomainToValue(VideoGame domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoGame fromValueToDomain(String value) {
		return new VIDEO_GAME(value);
	}

}
