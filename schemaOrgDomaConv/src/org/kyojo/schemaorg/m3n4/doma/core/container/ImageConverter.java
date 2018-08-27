package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IMAGE;
import org.kyojo.schemaorg.m3n4.core.Container.Image;

@ExternalDomain
public class ImageConverter implements DomainConverter<Image, String> {

	@Override
	public String fromDomainToValue(Image domain) {
		return domain.getNativeValue();
	}

	@Override
	public Image fromValueToDomain(String value) {
		return new IMAGE(value);
	}

}
