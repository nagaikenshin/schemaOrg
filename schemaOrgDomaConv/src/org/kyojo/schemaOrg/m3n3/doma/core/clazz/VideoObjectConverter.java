package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO_OBJECT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.VideoObject;

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
