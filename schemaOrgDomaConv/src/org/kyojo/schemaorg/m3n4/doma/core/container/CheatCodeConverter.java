package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHEAT_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.CheatCode;

@ExternalDomain
public class CheatCodeConverter implements DomainConverter<CheatCode, String> {

	@Override
	public String fromDomainToValue(CheatCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheatCode fromValueToDomain(String value) {
		return new CHEAT_CODE(value);
	}

}
