package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_RELEASE_FORMAT_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicReleaseFormatType;

@ExternalDomain
public class MusicReleaseFormatTypeConverter implements DomainConverter<MusicReleaseFormatType, String> {

	@Override
	public String fromDomainToValue(MusicReleaseFormatType domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicReleaseFormatType fromValueToDomain(String value) {
		return new MUSIC_RELEASE_FORMAT_TYPE(value);
	}

}
