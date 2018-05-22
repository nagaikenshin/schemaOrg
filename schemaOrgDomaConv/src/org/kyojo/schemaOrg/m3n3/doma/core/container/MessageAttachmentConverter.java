package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MESSAGE_ATTACHMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.MessageAttachment;

@ExternalDomain
public class MessageAttachmentConverter implements DomainConverter<MessageAttachment, String> {

	@Override
	public String fromDomainToValue(MessageAttachment domain) {
		return domain.getNativeValue();
	}

	@Override
	public MessageAttachment fromValueToDomain(String value) {
		return new MESSAGE_ATTACHMENT(value);
	}

}
