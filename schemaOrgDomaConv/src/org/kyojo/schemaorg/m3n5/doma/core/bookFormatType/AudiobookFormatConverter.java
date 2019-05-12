package org.kyojo.schemaorg.m3n5.doma.core.bookFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.bookFormatType.AUDIOBOOK_FORMAT;
import org.kyojo.schemaorg.m3n5.core.BookFormatType.AudiobookFormat;

@ExternalDomain
public class AudiobookFormatConverter implements DomainConverter<AudiobookFormat, String> {

	@Override
	public String fromDomainToValue(AudiobookFormat domain) {
		return domain.getNativeValue();
	}

	@Override
	public AudiobookFormat fromValueToDomain(String value) {
		return new AUDIOBOOK_FORMAT(value);
	}

}
