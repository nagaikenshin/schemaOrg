package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLAY_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PlayAction;

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
