package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REPLY_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReplyAction;

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
