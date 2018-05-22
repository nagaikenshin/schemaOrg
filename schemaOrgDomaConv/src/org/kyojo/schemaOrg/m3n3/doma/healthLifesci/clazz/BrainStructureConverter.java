package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.BRAIN_STRUCTURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.BrainStructure;

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
