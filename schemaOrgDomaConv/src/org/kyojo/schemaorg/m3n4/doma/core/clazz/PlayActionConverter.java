package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PLAY_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlayAction;

@ExternalDomain
public class PlayActionConverter implements DomainConverter<PlayAction, String> {

	@Override
	public String fromDomainToValue(PlayAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlayAction fromValueToDomain(String value) {
		return new PLAY_ACTION(value);
	}

}
