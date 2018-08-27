package org.kyojo.schemaorg.m3n4.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicReleaseFormatType.CASSETTE_FORMAT;
import org.kyojo.schemaorg.m3n4.core.MusicReleaseFormatType.CassetteFormat;

@ExternalDomain
public class CassetteFormatConverter implements DomainConverter<CassetteFormat, String> {

	@Override
	public String fromDomainToValue(CassetteFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public CassetteFormat fromValueToDomain(String value) {
		return new CASSETTE_FORMAT(value);
	}

}
