package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BRAIN_STRUCTURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BrainStructure;

@ExternalDomain
public class BrainStructureConverter implements DomainConverter<BrainStructure, String> {

	@Override
	public String fromDomainToValue(BrainStructure domain) {
		return domain.getNativeValue();
	}

	@Override
	public BrainStructure fromValueToDomain(String value) {
		return new BRAIN_STRUCTURE(value);
	}

}
