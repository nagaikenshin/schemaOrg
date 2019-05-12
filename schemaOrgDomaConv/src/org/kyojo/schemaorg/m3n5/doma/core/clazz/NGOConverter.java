package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NGO;
import org.kyojo.schemaorg.m3n5.core.Clazz;

@ExternalDomain
public class NGOConverter implements DomainConverter<Clazz.NGO, String> {

	@Override
	public String fromDomainToValue(Clazz.NGO domain) {
		return domain.getNativeValue();
	}

	@Override
	public Clazz.NGO fromValueToDomain(String value) {
		return new NGO(value);
	}

}
