package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.IMAGE_GALLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageGallery;

@ExternalDomain
public class ImageGalleryConverter implements DomainConverter<ImageGallery, String> {

	@Override
	public String fromDomainToValue(ImageGallery domain) {
		return domain.getNativeValue();
	}

	@Override
	public ImageGallery fromValueToDomain(String value) {
		return new IMAGE_GALLERY(value);
	}

}
