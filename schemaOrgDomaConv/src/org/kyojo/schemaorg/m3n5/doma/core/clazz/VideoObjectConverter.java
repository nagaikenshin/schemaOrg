package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VIDEO_OBJECT;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoObject;

@ExternalDomain
public class VideoObjectConverter implements DomainConverter<VideoObject, String> {

	@Override
	public String fromDomainToValue(VideoObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoObject fromValueToDomain(String value) {
		return new VIDEO_OBJECT(value);
	}

}
