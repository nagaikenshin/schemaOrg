package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PUBLICATION_TYPE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PublicationType;

@ExternalDomain
public class PublicationTypeConverter implements DomainConverter<PublicationType, String> {

	@Override
	public String fromDomainToValue(PublicationType domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicationType fromValueToDomain(String value) {
		return new PUBLICATION_TYPE(value);
	}

}
