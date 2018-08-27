package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ANATOMICAL_SYSTEM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.AnatomicalSystem;

@ExternalDomain
public class AnatomicalSystemConverter implements DomainConverter<AnatomicalSystem, String> {

	@Override
	public String fromDomainToValue(AnatomicalSystem domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnatomicalSystem fromValueToDomain(String value) {
		return new ANATOMICAL_SYSTEM(value);
	}

}
