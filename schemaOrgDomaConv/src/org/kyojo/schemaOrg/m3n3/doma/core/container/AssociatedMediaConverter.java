package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ASSOCIATED_MEDIA;
import org.kyojo.schemaOrg.m3n3.core.Container.AssociatedMedia;

@ExternalDomain
public class AssociatedMediaConverter implements DomainConverter<AssociatedMedia, String> {

	@Override
	public String fromDomainToValue(AssociatedMedia domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssociatedMedia fromValueToDomain(String value) {
		return new ASSOCIATED_MEDIA(value);
	}

}
