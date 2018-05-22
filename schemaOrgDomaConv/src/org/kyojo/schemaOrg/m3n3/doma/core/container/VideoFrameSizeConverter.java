package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO_FRAME_SIZE;
import org.kyojo.schemaOrg.m3n3.core.Container.VideoFrameSize;

@ExternalDomain
public class VideoFrameSizeConverter implements DomainConverter<VideoFrameSize, String> {

	@Override
	public String fromDomainToValue(VideoFrameSize domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoFrameSize fromValueToDomain(String value) {
		return new VIDEO_FRAME_SIZE(value);
	}

}
