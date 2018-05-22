package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLICATION_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PublicationEvent;

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
