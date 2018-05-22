package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ANATOMICAL_STRUCTURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.AnatomicalStructure;

@ExternalDomain
public class AnatomicalStructureConverter implements DomainConverter<AnatomicalStructure, String> {

	@Override
	public String fromDomainToValue(AnatomicalStructure domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnatomicalStructure fromValueToDomain(String value) {
		return new ANATOMICAL_STRUCTURE(value);
	}

}
