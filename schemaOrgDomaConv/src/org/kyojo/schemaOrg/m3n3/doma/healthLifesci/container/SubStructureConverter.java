package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SUB_STRUCTURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SubStructure;

@ExternalDomain
public class SubStructureConverter implements DomainConverter<SubStructure, String> {

	@Override
	public String fromDomainToValue(SubStructure domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubStructure fromValueToDomain(String value) {
		return new SUB_STRUCTURE(value);
	}

}
