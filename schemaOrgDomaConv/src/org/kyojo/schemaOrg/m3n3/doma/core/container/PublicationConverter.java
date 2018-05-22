package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLICATION;
import org.kyojo.schemaOrg.m3n3.core.Container.Publication;

@ExternalDomain
public class PublicationConverter implements DomainConverter<Publication, String> {

	@Override
	public String fromDomainToValue(Publication domain) {
		return domain.getNativeValue();
	}

	@Override
	public Publication fromValueToDomain(String value) {
		return new PUBLICATION(value);
	}

}
