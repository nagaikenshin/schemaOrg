package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PHOTO;
import org.kyojo.schemaorg.m3n5.core.Container.Photo;

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
