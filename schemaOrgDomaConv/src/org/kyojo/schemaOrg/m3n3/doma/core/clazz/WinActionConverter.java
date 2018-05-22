package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WIN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WinAction;

@ExternalDomain
public class WinActionConverter implements DomainConverter<WinAction, String> {

	@Override
	public String fromDomainToValue(WinAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public WinAction fromValueToDomain(String value) {
		return new WIN_ACTION(value);
	}

}
