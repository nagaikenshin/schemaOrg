package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_GROUP;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicGroup;

@ExternalDomain
public class MusicGroupConverter implements DomainConverter<MusicGroup, String> {

	@Override
	public String fromDomainToValue(MusicGroup domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicGroup fromValueToDomain(String value) {
		return new MUSIC_GROUP(value);
	}

}
