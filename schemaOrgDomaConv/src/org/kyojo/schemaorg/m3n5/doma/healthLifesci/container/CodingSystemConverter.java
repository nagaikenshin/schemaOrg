package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.CODING_SYSTEM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CodingSystem;

@ExternalDomain
public class CodingSystemConverter implements DomainConverter<CodingSystem, String> {

	@Override
	public String fromDomainToValue(CodingSystem domain) {
		return domain.getNativeValue();
	}

	@Override
	public CodingSystem fromValueToDomain(String value) {
		return new CODING_SYSTEM(value);
	}

}
