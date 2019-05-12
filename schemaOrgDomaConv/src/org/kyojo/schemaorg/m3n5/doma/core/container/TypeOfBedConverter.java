package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TYPE_OF_BED;
import org.kyojo.schemaorg.m3n5.core.Container.TypeOfBed;

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
