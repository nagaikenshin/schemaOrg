package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRESCHOOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Preschool;

@ExternalDomain
public class PreschoolConverter implements DomainConverter<Preschool, String> {

	@Override
	public String fromDomainToValue(Preschool domain) {
		return domain.getNativeValue();
	}

	@Override
	public Preschool fromValueToDomain(String value) {
		return new PRESCHOOL(value);
	}

}
