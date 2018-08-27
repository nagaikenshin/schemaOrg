package org.kyojo.schemaorg.m3n4.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.AUDIOBOOK;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Audiobook;

@ExternalDomain
public class AudiobookConverter implements DomainConverter<Audiobook, String> {

	@Override
	public String fromDomainToValue(Audiobook domain) {
		return domain.getNativeValue();
	}

	@Override
	public Audiobook fromValueToDomain(String value) {
		return new AUDIOBOOK(value);
	}

}
