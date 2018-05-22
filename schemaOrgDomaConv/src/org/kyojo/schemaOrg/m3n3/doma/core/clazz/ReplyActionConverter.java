package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REPLY_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReplyAction;

@ExternalDomain
public class ReplyActionConverter implements DomainConverter<ReplyAction, String> {

	@Override
	public String fromDomainToValue(ReplyAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReplyAction fromValueToDomain(String value) {
		return new REPLY_ACTION(value);
	}

}
