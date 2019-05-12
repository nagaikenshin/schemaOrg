package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LYRICS;
import org.kyojo.schemaorg.m3n5.core.Container.Lyrics;

@ExternalDomain
public class LyricsConverter implements DomainConverter<Lyrics, String> {

	@Override
	public String fromDomainToValue(Lyrics domain) {
		return domain.getNativeValue();
	}

	@Override
	public Lyrics fromValueToDomain(String value) {
		return new LYRICS(value);
	}

}
