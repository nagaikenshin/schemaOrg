package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.NORMAL_RANGE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.NormalRange;

@ExternalDomain
public class NormalRangeConverter implements DomainConverter<NormalRange, String> {

	@Override
	public String fromDomainToValue(NormalRange domain) {
		return domain.getNativeValue();
	}

	@Override
	public NormalRange fromValueToDomain(String value) {
		return new NORMAL_RANGE(value);
	}

}
