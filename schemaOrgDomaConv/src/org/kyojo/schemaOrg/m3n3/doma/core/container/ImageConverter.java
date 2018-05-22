package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IMAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;

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
