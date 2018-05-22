package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.SPEAKABLE;
import org.kyojo.schemaOrg.m3n3.pending.Container.Speakable;

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
