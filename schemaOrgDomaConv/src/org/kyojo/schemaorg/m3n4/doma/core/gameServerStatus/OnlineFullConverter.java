package org.kyojo.schemaorg.m3n4.doma.core.gameServerStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.gameServerStatus.ONLINE_FULL;
import org.kyojo.schemaorg.m3n4.core.GameServerStatus.OnlineFull;

@ExternalDomain
public class OnlineFullConverter implements DomainConverter<OnlineFull, String> {

	@Override
	public String fromDomainToValue(OnlineFull domain) {
		return domain.getNativeValue();
	}

	@Override
	public OnlineFull fromValueToDomain(String value) {
		return new ONLINE_FULL(value);
	}

}
