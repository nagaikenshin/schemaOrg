package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LYRICIST;
import org.kyojo.schemaorg.m3n5.core.Container.Lyricist;

@ExternalDomain
public class LyricistConverter implements DomainConverter<Lyricist, String> {

	@Override
	public String fromDomainToValue(Lyricist domain) {
		return domain.getNativeValue();
	}

	@Override
	public Lyricist fromValueToDomain(String value) {
		return new LYRICIST(value);
	}

}
