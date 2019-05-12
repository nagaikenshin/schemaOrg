package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ANATOMICAL_STRUCTURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.AnatomicalStructure;

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
