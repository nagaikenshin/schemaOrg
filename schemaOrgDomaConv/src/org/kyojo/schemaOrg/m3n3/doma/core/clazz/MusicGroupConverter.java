package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_GROUP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicGroup;

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
