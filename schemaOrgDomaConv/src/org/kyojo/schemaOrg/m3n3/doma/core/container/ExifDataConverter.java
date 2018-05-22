package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXIF_DATA;
import org.kyojo.schemaOrg.m3n3.core.Container.ExifData;

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
