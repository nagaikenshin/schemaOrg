package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INTANGIBLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Intangible;

@ExternalDomain
public class IntangibleConverter implements DomainConverter<Intangible, String> {

	@Override
	public String fromDomainToValue(Intangible domain) {
		return domain.getNativeValue();
	}

	@Override
	public Intangible fromValueToDomain(String value) {
		return new INTANGIBLE(value);
	}

}
