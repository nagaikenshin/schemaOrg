package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VOLCANO;
import org.kyojo.schemaorg.m3n5.core.Clazz.Volcano;

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