package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOIN_MOIN;
import org.kyojo.schemaorg.m3n5.core.Container.MoinMoin;

@ExternalDomain
public class MoinMoinConverter implements DomainConverter<MoinMoin, String> {

	@Override
	public String fromDomainToValue(MoinMoin domain) {
		return domain.getNativeValue();
	}

	@Override
	public MoinMoin fromValueToDomain(String value) {
		return new MOIN_MOIN(value);
	}

}
