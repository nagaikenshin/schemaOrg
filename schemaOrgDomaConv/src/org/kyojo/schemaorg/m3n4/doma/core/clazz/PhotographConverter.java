package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PHOTOGRAPH;
import org.kyojo.schemaorg.m3n4.core.Clazz.Photograph;

@ExternalDomain
public class PhotographConverter implements DomainConverter<Photograph, String> {

	@Override
	public String fromDomainToValue(Photograph domain) {
		return domain.getNativeValue();
	}

	@Override
	public Photograph fromValueToDomain(String value) {
		return new PHOTOGRAPH(value);
	}

}
