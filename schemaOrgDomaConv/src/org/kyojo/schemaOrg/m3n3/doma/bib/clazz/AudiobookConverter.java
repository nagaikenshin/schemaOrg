package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.AUDIOBOOK;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.Audiobook;

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
