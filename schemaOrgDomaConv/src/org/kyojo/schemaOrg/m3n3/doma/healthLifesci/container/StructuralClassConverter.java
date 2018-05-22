package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STRUCTURAL_CLASS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.StructuralClass;

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
