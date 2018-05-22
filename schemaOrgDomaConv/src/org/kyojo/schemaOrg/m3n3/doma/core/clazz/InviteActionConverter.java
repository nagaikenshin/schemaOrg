package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INVITE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InviteAction;

@ExternalDomain
public class InviteActionConverter implements DomainConverter<InviteAction, String> {

	@Override
	public String fromDomainToValue(InviteAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public InviteAction fromValueToDomain(String value) {
		return new INVITE_ACTION(value);
	}

}
