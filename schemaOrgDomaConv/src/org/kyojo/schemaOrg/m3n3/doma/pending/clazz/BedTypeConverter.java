package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.BED_TYPE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.BedType;

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
