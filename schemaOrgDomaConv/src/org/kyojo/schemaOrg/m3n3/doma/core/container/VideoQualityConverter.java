package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO_QUALITY;
import org.kyojo.schemaOrg.m3n3.core.Container.VideoQuality;

@ExternalDomain
public class VideoQualityConverter implements DomainConverter<VideoQuality, String> {

	@Override
	public String fromDomainToValue(VideoQuality domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoQuality fromValueToDomain(String value) {
		return new VIDEO_QUALITY(value);
	}

}
