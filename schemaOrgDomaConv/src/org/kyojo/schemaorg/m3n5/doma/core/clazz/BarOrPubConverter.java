package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BAR_OR_PUB;
import org.kyojo.schemaorg.m3n5.core.Clazz.BarOrPub;

@ExternalDomain
public class BarOrPubConverter implements DomainConverter<BarOrPub, String> {

	@Override
	public String fromDomainToValue(BarOrPub domain) {
		return domain.getNativeValue();
	}

	@Override
	public BarOrPub fromValueToDomain(String value) {
		return new BAR_OR_PUB(value);
	}

}
