package org.kyojo.schemaOrg.m3n3.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicReleaseFormatType.DIGITAL_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.MusicReleaseFormatType.DigitalFormat;

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
