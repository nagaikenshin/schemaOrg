package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CIVIC_STRUCTURE;
import org.kyojo.schemaorg.m3n4.core.Clazz.CivicStructure;

@ExternalDomain
public class CivicStructureConverter implements DomainConverter<CivicStructure, String> {

	@Override
	public String fromDomainToValue(CivicStructure domain) {
		return domain.getNativeValue();
	}

	@Override
	public CivicStructure fromValueToDomain(String value) {
		return new CIVIC_STRUCTURE(value);
	}

}
