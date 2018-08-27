package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXIF_DATA;
import org.kyojo.schemaorg.m3n4.core.Container.ExifData;

@ExternalDomain
public class ExifDataConverter implements DomainConverter<ExifData, String> {

	@Override
	public String fromDomainToValue(ExifData domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExifData fromValueToDomain(String value) {
		return new EXIF_DATA(value);
	}

}
