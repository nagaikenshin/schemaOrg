package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_BY;
import org.kyojo.schemaorg.m3n5.core.Container.MusicBy;

@ExternalDomain
public class MusicByConverter implements DomainConverter<MusicBy, String> {

	@Override
	public String fromDomainToValue(MusicBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicBy fromValueToDomain(String value) {
		return new MUSIC_BY(value);
	}

}
