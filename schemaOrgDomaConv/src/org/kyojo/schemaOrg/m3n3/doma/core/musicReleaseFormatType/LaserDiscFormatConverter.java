package org.kyojo.schemaOrg.m3n3.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicReleaseFormatType.LASER_DISC_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.MusicReleaseFormatType.LaserDiscFormat;

@ExternalDomain
public class LaserDiscFormatConverter implements DomainConverter<LaserDiscFormat, String> {

	@Override
	public String fromDomainToValue(LaserDiscFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public LaserDiscFormat fromValueToDomain(String value) {
		return new LASER_DISC_FORMAT(value);
	}

}
