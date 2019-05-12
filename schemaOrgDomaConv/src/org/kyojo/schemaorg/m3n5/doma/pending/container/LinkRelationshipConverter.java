package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LINK_RELATIONSHIP;
import org.kyojo.schemaorg.m3n5.pending.Container.LinkRelationship;

@ExternalDomain
public class LinkRelationshipConverter implements DomainConverter<LinkRelationship, String> {

	@Override
	public String fromDomainToValue(LinkRelationship domain) {
		return domain.getNativeValue();
	}

	@Override
	public LinkRelationship fromValueToDomain(String value) {
		return new LINK_RELATIONSHIP(value);
	}

}
