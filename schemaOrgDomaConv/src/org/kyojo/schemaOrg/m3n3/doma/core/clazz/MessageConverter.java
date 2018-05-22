package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MESSAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Message;

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
