package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EMAIL_MESSAGE;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmailMessage;

@ExternalDomain
public class EmailMessageConverter implements DomainConverter<EmailMessage, String> {

	@Override
	public String fromDomainToValue(EmailMessage domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmailMessage fromValueToDomain(String value) {
		return new EMAIL_MESSAGE(value);
	}

}