package org.kyojo.schemaorg.m3n5.doma.core.gamePlayMode;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.gamePlayMode.MULTI_PLAYER;
import org.kyojo.schemaorg.m3n5.core.GamePlayMode.MultiPlayer;

@ExternalDomain
public class MultiPlayerConverter implements DomainConverter<MultiPlayer, String> {

	@Override
	public String fromDomainToValue(MultiPlayer domain) {
		return domain.getNativeValue();
	}

	@Override
	public MultiPlayer fromValueToDomain(String value) {
		return new MULTI_PLAYER(value);
	}

}
