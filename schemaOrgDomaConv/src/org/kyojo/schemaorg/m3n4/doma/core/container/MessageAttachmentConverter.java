package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MESSAGE_ATTACHMENT;
import org.kyojo.schemaorg.m3n4.core.Container.MessageAttachment;

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
