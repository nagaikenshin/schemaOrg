package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ZOO;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Zoo;

@ExternalDomain
public class ZooConverter implements DomainConverter<Zoo, String> {

	@Override
	public String fromDomainToValue(Zoo domain) {
		return domain.getNativeValue();
	}

	@Override
	public Zoo fromValueToDomain(String value) {
		return new ZOO(value);
	}

}
