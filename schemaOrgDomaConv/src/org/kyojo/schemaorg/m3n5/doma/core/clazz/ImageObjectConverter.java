package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.IMAGE_OBJECT;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageObject;

@ExternalDomain
public class ImageObjectConverter implements DomainConverter<ImageObject, String> {

	@Override
	public String fromDomainToValue(ImageObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public ImageObject fromValueToDomain(String value) {
		return new IMAGE_OBJECT(value);
	}

}
