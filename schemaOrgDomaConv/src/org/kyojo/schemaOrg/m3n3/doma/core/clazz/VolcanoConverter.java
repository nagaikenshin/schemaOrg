package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VOLCANO;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Volcano;

@ExternalDomain
public class VolcanoConverter implements DomainConverter<Volcano, String> {

	@Override
	public String fromDomainToValue(Volcano domain) {
		return domain.getNativeValue();
	}

	@Override
	public Volcano fromValueToDomain(String value) {
		return new VOLCANO(value);
	}

}
