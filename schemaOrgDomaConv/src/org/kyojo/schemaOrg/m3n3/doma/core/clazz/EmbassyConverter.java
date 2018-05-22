package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EMBASSY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Embassy;

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
