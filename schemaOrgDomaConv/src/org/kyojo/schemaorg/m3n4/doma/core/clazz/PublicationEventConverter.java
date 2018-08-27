package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PUBLICATION_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationEvent;

@ExternalDomain
public class PublicationEventConverter implements DomainConverter<PublicationEvent, String> {

	@Override
	public String fromDomainToValue(PublicationEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicationEvent fromValueToDomain(String value) {
		return new PUBLICATION_EVENT(value);
	}

}
