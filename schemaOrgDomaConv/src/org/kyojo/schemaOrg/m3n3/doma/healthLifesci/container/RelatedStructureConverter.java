package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RELATED_STRUCTURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedStructure;

@ExternalDomain
public class RelatedStructureConverter implements DomainConverter<RelatedStructure, String> {

	@Override
	public String fromDomainToValue(RelatedStructure domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedStructure fromValueToDomain(String value) {
		return new RELATED_STRUCTURE(value);
	}

}
