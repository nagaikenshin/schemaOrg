package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPEAKABLE;
import org.kyojo.schemaorg.m3n5.core.Container.Speakable;

@ExternalDomain
public class SpeakableConverter implements DomainConverter<Speakable, String> {

	@Override
	public String fromDomainToValue(Speakable domain) {
		return domain.getNativeValue();
	}

	@Override
	public Speakable fromValueToDomain(String value) {
		return new SPEAKABLE(value);
	}

}
