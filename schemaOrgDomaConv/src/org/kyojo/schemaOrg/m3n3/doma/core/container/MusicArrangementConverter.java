package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_ARRANGEMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.MusicArrangement;

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
