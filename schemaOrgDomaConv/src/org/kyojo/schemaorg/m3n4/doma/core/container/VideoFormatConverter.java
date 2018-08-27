package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VIDEO_FORMAT;
import org.kyojo.schemaorg.m3n4.core.Container.VideoFormat;

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