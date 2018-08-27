package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EMBASSY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Embassy;

@ExternalDomain
public class EmbassyConverter implements DomainConverter<Embassy, String> {

	@Override
	public String fromDomainToValue(Embassy domain) {
		return domain.getNativeValue();
	}

	@Override
	public Embassy fromValueToDomain(String value) {
		return new EMBASSY(value);
	}

}
