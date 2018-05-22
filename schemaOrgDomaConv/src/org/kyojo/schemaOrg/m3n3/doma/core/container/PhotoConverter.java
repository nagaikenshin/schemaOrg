package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PHOTO;
import org.kyojo.schemaOrg.m3n3.core.Container.Photo;

@ExternalDomain
public class PhotoConverter implements DomainConverter<Photo, String> {

	@Override
	public String fromDomainToValue(Photo domain) {
		return domain.getNativeValue();
	}

	@Override
	public Photo fromValueToDomain(String value) {
		return new PHOTO(value);
	}

}
