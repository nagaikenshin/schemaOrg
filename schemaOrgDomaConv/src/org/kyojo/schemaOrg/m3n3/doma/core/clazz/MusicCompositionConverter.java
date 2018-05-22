package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MUSIC_COMPOSITION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicComposition;

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
