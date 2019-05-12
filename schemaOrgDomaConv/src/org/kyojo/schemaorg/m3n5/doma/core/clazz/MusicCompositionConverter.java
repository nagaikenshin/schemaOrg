package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_COMPOSITION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicComposition;

@ExternalDomain
public class MusicCompositionConverter implements DomainConverter<MusicComposition, String> {

	@Override
	public String fromDomainToValue(MusicComposition domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicComposition fromValueToDomain(String value) {
		return new MUSIC_COMPOSITION(value);
	}

}
