package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREATIVE_WORK;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;

@ExternalDomain
public class CreativeWorkConverter implements DomainConverter<CreativeWork, String> {

	@Override
	public String fromDomainToValue(CreativeWork domain) {
		return domain.getNativeValue();
	}

	@Override
	public CreativeWork fromValueToDomain(String value) {
		return new CREATIVE_WORK(value);
	}

}
