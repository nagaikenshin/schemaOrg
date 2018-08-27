package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BIOMECHNICAL_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.BiomechnicalClass;

@ExternalDomain
public class BiomechnicalClassConverter implements DomainConverter<BiomechnicalClass, String> {

	@Override
	public String fromDomainToValue(BiomechnicalClass domain) {
		return domain.getNativeValue();
	}

	@Override
	public BiomechnicalClass fromValueToDomain(String value) {
		return new BIOMECHNICAL_CLASS(value);
	}

}
