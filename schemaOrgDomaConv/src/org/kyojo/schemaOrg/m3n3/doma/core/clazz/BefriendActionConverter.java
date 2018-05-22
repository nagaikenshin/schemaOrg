package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BEFRIEND_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BefriendAction;

@ExternalDomain
public class BefriendActionConverter implements DomainConverter<BefriendAction, String> {

	@Override
	public String fromDomainToValue(BefriendAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public BefriendAction fromValueToDomain(String value) {
		return new BEFRIEND_ACTION(value);
	}

}
