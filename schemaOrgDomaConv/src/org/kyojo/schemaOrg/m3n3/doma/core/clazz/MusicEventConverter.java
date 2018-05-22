package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicEvent;

@ExternalDomain
public class MusicEventConverter implements DomainConverter<MusicEvent, String> {

	@Override
	public String fromDomainToValue(MusicEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicEvent fromValueToDomain(String value) {
		return new MUSIC_EVENT(value);
	}

}
