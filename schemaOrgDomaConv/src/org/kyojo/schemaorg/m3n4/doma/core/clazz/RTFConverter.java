package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RTF;
import org.kyojo.schemaorg.m3n4.core.Clazz;

@ExternalDomain
public class RTFConverter implements DomainConverter<Clazz.RTF, String> {

	@Override
	public String fromDomainToValue(Clazz.RTF domain) {
		return domain.getNativeValue();
	}

	@Override
	public Clazz.RTF fromValueToDomain(String value) {
		return new RTF(value);
	}

}
