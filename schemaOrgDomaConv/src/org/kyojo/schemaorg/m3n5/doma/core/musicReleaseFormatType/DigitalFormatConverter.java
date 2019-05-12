package org.kyojo.schemaorg.m3n5.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.musicReleaseFormatType.DIGITAL_FORMAT;
import org.kyojo.schemaorg.m3n5.core.MusicReleaseFormatType.DigitalFormat;

@ExternalDomain
public class DigitalFormatConverter implements DomainConverter<DigitalFormat, String> {

	@Override
	public String fromDomainToValue(DigitalFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public DigitalFormat fromValueToDomain(String value) {
		return new DIGITAL_FORMAT(value);
	}

}
