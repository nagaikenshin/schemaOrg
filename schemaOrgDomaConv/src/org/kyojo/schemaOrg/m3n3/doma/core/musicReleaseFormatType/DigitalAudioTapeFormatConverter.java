package org.kyojo.schemaOrg.m3n3.doma.core.musicReleaseFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.musicReleaseFormatType.DIGITAL_AUDIO_TAPE_FORMAT;
import org.kyojo.schemaOrg.m3n3.core.MusicReleaseFormatType.DigitalAudioTapeFormat;

@ExternalDomain
public class DigitalAudioTapeFormatConverter implements DomainConverter<DigitalAudioTapeFormat, String> {

	@Override
	public String fromDomainToValue(DigitalAudioTapeFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public DigitalAudioTapeFormat fromValueToDomain(String value) {
		return new DIGITAL_AUDIO_TAPE_FORMAT(value);
	}

}
