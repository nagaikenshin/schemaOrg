package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONVERSATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Conversation;

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
