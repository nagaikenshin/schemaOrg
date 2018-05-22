package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RELATED_LINK;
import org.kyojo.schemaOrg.m3n3.core.Container.RelatedLink;

@ExternalDomain
public class RelatedLinkConverter implements DomainConverter<RelatedLink, String> {

	@Override
	public String fromDomainToValue(RelatedLink domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedLink fromValueToDomain(String value) {
		return new RELATED_LINK(value);
	}

}
