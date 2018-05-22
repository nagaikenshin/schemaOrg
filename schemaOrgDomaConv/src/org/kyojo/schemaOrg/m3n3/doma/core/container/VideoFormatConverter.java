package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.Container.VideoFormat;

@ExternalDomain
public class VideoFormatConverter implements DomainConverter<VideoFormat, String> {

	@Override
	public String fromDomainToValue(VideoFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoFormat fromValueToDomain(String value) {
		return new VIDEO_FORMAT(value);
	}

}
