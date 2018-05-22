package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TYPE_OF_BED;
import org.kyojo.schemaOrg.m3n3.core.Container.TypeOfBed;

@ExternalDomain
public class TypeOfBedConverter implements DomainConverter<TypeOfBed, String> {

	@Override
	public String fromDomainToValue(TypeOfBed domain) {
		return domain.getNativeValue();
	}

	@Override
	public TypeOfBed fromValueToDomain(String value) {
		return new TYPE_OF_BED(value);
	}

}
