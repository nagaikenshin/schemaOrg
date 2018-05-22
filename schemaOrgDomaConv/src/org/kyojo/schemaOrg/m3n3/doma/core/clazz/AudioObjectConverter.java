package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUDIO_OBJECT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AudioObject;

@ExternalDomain
public class AudioObjectConverter implements DomainConverter<AudioObject, String> {

	@Override
	public String fromDomainToValue(AudioObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public AudioObject fromValueToDomain(String value) {
		return new AUDIO_OBJECT(value);
	}

}
