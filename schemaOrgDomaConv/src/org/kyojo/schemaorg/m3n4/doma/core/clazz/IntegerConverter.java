package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INTEGER;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;

@ExternalDomain
public class IntegerConverter implements DomainConverter<Integer, Long> {

	@Override
	public Long fromDomainToValue(Integer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Integer fromValueToDomain(Long value) {
		return new INTEGER(value);
	}

}
