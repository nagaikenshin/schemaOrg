package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EMAIL_MESSAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EmailMessage;

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
