package org.kyojo.schemaorg.m3n4.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicReleaseFormatType.DVD_FORMAT;
import org.kyojo.schemaorg.m3n4.core.MusicReleaseFormatType.DVDFormat;

@ExternalDomain
public class DVDFormatConverter implements DomainConverter<DVDFormat, String> {

	@Override
	public String fromDomainToValue(DVDFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public DVDFormat fromValueToDomain(String value) {
		return new DVD_FORMAT(value);
	}

}
