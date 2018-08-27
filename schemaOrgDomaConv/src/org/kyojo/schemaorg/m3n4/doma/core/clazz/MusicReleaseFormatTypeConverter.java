package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MUSIC_RELEASE_FORMAT_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicReleaseFormatType;

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
