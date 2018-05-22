package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IMAGE_GALLERY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ImageGallery;

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
