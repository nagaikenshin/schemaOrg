package org.kyojo.schemaorg.m3n4.doma.core.gamePlayMode;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.gamePlayMode.SINGLE_PLAYER;
import org.kyojo.schemaorg.m3n4.core.GamePlayMode.SinglePlayer;

@ExternalDomain
public class SinglePlayerConverter implements DomainConverter<SinglePlayer, String> {

	@Override
	public String fromDomainToValue(SinglePlayer domain) {
		return domain.getNativeValue();
	}

	@Override
	public SinglePlayer fromValueToDomain(String value) {
		return new SINGLE_PLAYER(value);
	}

}
