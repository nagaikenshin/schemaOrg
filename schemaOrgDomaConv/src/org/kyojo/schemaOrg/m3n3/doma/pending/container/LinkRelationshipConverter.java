package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LINK_RELATIONSHIP;
import org.kyojo.schemaOrg.m3n3.pending.Container.LinkRelationship;

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
