package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicStore;

@ExternalDomain
public class MusicStoreConverter implements DomainConverter<MusicStore, String> {

	@Override
	public String fromDomainToValue(MusicStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicStore fromValueToDomain(String value) {
		return new MUSIC_STORE(value);
	}

}
