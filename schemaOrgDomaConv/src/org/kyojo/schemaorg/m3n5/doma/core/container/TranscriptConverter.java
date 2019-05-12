package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TRANSCRIPT;
import org.kyojo.schemaorg.m3n5.core.Container.Transcript;

@ExternalDomain
public class TranscriptConverter implements DomainConverter<Transcript, String> {

	@Override
	public String fromDomainToValue(Transcript domain) {
		return domain.getNativeValue();
	}

	@Override
	public Transcript fromValueToDomain(String value) {
		return new TRANSCRIPT(value);
	}

}
