package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BED_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.BedType;

@ExternalDomain
public class BedTypeConverter implements DomainConverter<BedType, String> {

	@Override
	public String fromDomainToValue(BedType domain) {
		return domain.getNativeValue();
	}

	@Override
	public BedType fromValueToDomain(String value) {
		return new BED_TYPE(value);
	}

}
