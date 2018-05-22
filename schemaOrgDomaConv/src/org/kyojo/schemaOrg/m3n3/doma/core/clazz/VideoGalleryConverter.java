package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VIDEO_GALLERY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.VideoGallery;

@ExternalDomain
public class VideoGalleryConverter implements DomainConverter<VideoGallery, String> {

	@Override
	public String fromDomainToValue(VideoGallery domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoGallery fromValueToDomain(String value) {
		return new VIDEO_GALLERY(value);
	}

}
