package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_RECORDING;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicRecording;

@ExternalDomain
public class MusicRecordingConverter implements DomainConverter<MusicRecording, String> {

	@Override
	public String fromDomainToValue(MusicRecording domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicRecording fromValueToDomain(String value) {
		return new MUSIC_RECORDING(value);
	}

}
