package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PART_OF_SYSTEM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PartOfSystem;

@ExternalDomain
public class PartOfSystemConverter implements DomainConverter<PartOfSystem, String> {

	@Override
	public String fromDomainToValue(PartOfSystem domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartOfSystem fromValueToDomain(String value) {
		return new PART_OF_SYSTEM(value);
	}

}