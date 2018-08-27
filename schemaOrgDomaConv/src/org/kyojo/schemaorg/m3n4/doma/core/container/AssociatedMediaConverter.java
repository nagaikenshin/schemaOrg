package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ASSOCIATED_MEDIA;
import org.kyojo.schemaorg.m3n4.core.Container.AssociatedMedia;

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
