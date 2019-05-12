package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicEvent;

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
