package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AUDIO;
import org.kyojo.schemaorg.m3n4.core.Container.Audio;

@ExternalDomain
public class AudioConverter implements DomainConverter<Audio, String> {

	@Override
	public String fromDomainToValue(Audio domain) {
		return domain.getNativeValue();
	}

	@Override
	public Audio fromValueToDomain(String value) {
		return new AUDIO(value);
	}

}
