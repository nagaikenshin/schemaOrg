package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MESSAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Message;

@ExternalDomain
public class MessageConverter implements DomainConverter<Message, String> {

	@Override
	public String fromDomainToValue(Message domain) {
		return domain.getNativeValue();
	}

	@Override
	public Message fromValueToDomain(String value) {
		return new MESSAGE(value);
	}

}
