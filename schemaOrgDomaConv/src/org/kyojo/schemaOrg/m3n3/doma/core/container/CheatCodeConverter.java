package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHEAT_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.CheatCode;

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
