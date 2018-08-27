package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VIDEO_GAME_CLIP;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameClip;

@ExternalDomain
public class VideoGameClipConverter implements DomainConverter<VideoGameClip, String> {

	@Override
	public String fromDomainToValue(VideoGameClip domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoGameClip fromValueToDomain(String value) {
		return new VIDEO_GAME_CLIP(value);
	}

}