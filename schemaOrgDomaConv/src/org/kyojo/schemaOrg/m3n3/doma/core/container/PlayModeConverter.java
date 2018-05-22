package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLAY_MODE;
import org.kyojo.schemaOrg.m3n3.core.Container.PlayMode;

@ExternalDomain
public class PlayModeConverter implements DomainConverter<PlayMode, String> {

	@Override
	public String fromDomainToValue(PlayMode domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlayMode fromValueToDomain(String value) {
		return new PLAY_MODE(value);
	}

}
