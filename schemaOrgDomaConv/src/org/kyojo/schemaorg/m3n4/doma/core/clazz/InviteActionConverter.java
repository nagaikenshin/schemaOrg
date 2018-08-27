package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INVITE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.InviteAction;

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
