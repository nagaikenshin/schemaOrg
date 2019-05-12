package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.PLAY;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Play;

@ExternalDomain
public class PlayConverter implements DomainConverter<Play, String> {

	@Override
	public String fromDomainToValue(Play domain) {
		return domain.getNativeValue();
	}

	@Override
	public Play fromValueToDomain(String value) {
		return new PLAY(value);
	}

}
