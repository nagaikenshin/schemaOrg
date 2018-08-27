package org.kyojo.schemaorg.m3n4.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicReleaseFormatType.VINYL_FORMAT;
import org.kyojo.schemaorg.m3n4.core.MusicReleaseFormatType.VinylFormat;

@ExternalDomain
public class VinylFormatConverter implements DomainConverter<VinylFormat, String> {

	@Override
	public String fromDomainToValue(VinylFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public VinylFormat fromValueToDomain(String value) {
		return new VINYL_FORMAT(value);
	}

}
