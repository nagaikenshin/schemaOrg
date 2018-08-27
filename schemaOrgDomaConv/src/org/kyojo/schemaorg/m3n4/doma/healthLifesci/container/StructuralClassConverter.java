package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STRUCTURAL_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StructuralClass;

@ExternalDomain
public class StructuralClassConverter implements DomainConverter<StructuralClass, String> {

	@Override
	public String fromDomainToValue(StructuralClass domain) {
		return domain.getNativeValue();
	}

	@Override
	public StructuralClass fromValueToDomain(String value) {
		return new STRUCTURAL_CLASS(value);
	}

}
