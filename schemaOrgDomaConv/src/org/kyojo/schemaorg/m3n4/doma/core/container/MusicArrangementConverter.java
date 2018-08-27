package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MUSIC_ARRANGEMENT;
import org.kyojo.schemaorg.m3n4.core.Container.MusicArrangement;

@ExternalDomain
public class MusicArrangementConverter implements DomainConverter<MusicArrangement, String> {

	@Override
	public String fromDomainToValue(MusicArrangement domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicArrangement fromValueToDomain(String value) {
		return new MUSIC_ARRANGEMENT(value);
	}

}
