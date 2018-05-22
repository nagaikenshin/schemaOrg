package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONVERSATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Conversation;

@ExternalDomain
public class ConversationConverter implements DomainConverter<Conversation, String> {

	@Override
	public String fromDomainToValue(Conversation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Conversation fromValueToDomain(String value) {
		return new CONVERSATION(value);
	}

}
